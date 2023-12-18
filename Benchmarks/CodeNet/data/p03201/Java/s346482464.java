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
        for(int i = n - 1; i >= 0; i--){
            if(bl[i] == true){
                for(int k = 31; k >= 0; k--){
                    long x = (long) Math.pow(2, k);
                    int j = Arrays.binarySearch(a, x - a[i]);
                    if(j >= 0){
                        if(bl[j] == true && j != i){
                            bl[j] = false;
                            bl[i] = false;
                            ans++;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}