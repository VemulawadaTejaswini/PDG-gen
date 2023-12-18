import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i < n;i++) a[i] = sc.nextInt();

        Arrays.sort(a);
        for(int i = 0;i < a.length / 2;i++) {
            int tmp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = tmp;
        }
        
        if(a.length == 2) {
            System.out.println(a[0] + " " + a[1]);
        }
        else {
            long max = -1;
            long maxN = -1;
            long maxR = -1;
            for(int i = 0;i < a.length;i++) {
                int candidate1 = a[(a.length - i) / 2];
                int candidate2 = a[1 + ((a.length - i) / 2)];
                
                long num = nCr(a[i], candidate1);
                long num2 = nCr(a[i], candidate2);
                long big = num > num2 ? num : num2;
                
                if(max < big) {
                    max = big;
                    maxN = a[i];
                    if(num > num2) maxR = candidate1;
                    else maxR = candidate2;
                }
            }

            System.out.println(maxN + " " + maxR);
        }
    }
    
    private static long nCr(long n, long k) {
        long r = 1;
        for(long d = 1;d <= k;d++) {
            r *= n--;
            r /= d;
        }
        return r;
    }
    
}
