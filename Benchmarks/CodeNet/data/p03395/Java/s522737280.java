import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static int[] a;
    static int[] b;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        a = new int[n];
        b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scan.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if(a[i] < b[i] * 2) {
                System.out.println(-1);
                return;
            }
        }

        long sum = 0;
 
       for (int i = 0; i <= n; i++) {
            int index = se(n);
            if(index == -1){
                System.out.println(sum);
                return;
            }
            int k = a[index] - b[index];
            for (int j = 0; j < n; j++) {
                int t = (a[j] % k);
                if (t >= b[j]) {
                    a[j] = t;
                }
            }
            sum += ((long)k) * k;
        }
    }

    static int se(int n) {
        int min = Integer.MAX_VALUE;
        int ret = -1;
        for (int i = 0; i < n; i++) {
            int t = a[i] - b[i];
            if ( min > t && t != 0) {
                min = t;
                ret = i;
            }
        }
        return ret;
    }
}