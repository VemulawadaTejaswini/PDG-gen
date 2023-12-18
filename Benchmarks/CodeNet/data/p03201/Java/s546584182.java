import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        boolean[] bl = new boolean[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextLong();
            bl[i] = true;
        }
        Arrays.sort(a);
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(bl[i] == true){
            for(int k = 1; k <= 30; k++){
                long x = (long) Math.pow(2, k);
                if(Arrays.binarySearch(a, x - a[i]) >= 0){
                    int j = Arrays.binarySearch(a, x - a[i]);
                    if(bl[j] == true && j != i){
                    bl[j] = false;
                    bl[i] = false;
                    ans++;
                    }
                }
            }
            }
        }
        System.out.println(ans);
    }
}