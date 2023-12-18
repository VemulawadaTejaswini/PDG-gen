import java.util.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        int[] l = new int[Q];
        int[] r = new int[Q];

        for(int i = 0; i < Q; i++){
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }

        // Creating an array of prime numbers

        int[] p = new int[30000];
        p[0] = 2;
        int index = 0;
        for(int i = 3; i < 100000; i++){
            boolean bl = true;
            for(int j = 0;  p[j] * p[j] <= i; j++){
                if(i % p[j] == 0){
                    bl = false;
                    break;
                }
            }
            if(bl == true){
                p[++index] = i;
            }
        }

        int[] d = new int[1000001];
        d[0] = 0;

        Arrays.sort(p);
        for(int i = 1; i < 1000001; i++){
            if(Arrays.binarySearch(p, i) >= 0 && Arrays.binarySearch(p, (i + 1) / 2)  >= 0){
                d[i] = d[i-1] + 1;
            }
            else{
                d[i] = d[i-1]; 
            }
        }
        int[] ans = new int[Q];
        for(int i = 0; i < Q; i++){
            ans[i] = d[r[i]] - d[l[i] - 1];
            System.out.println(ans[i]);
        }
//        for(int i = 0; i < 30; i++){
  //          System.out.println(i + " " +d[i]);
    //    }
    }
}