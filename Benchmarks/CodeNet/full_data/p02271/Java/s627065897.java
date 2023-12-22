import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i=0; i<n; ++i) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int q = sc.nextInt();
        int flag = 0;
        int m = 0;

        int[] sum = new int[1 << n];

        for (int i=0; i<q; ++i) {
            m = sc.nextInt();
            flag = 0;
            for (int j=0; j<Math.pow(2, n); ++j) {
                if (sum[j] == 0) {
                    for (int k=0; k<n; ++k) {
                        if (((j >> k) & 1) == 1) {
                            sum[j] += a[k];
                        }
                    }
                }
                if (sum[j] == m) {
                    flag = 1;
                    break;
                }
            }
            System.out.println(flag == 1 ? "yes" : "no");
        }

    }
}
