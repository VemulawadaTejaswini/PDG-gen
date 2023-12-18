import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        try {
            Scanner Sc = new Scanner(System.in);
            int n = Sc.nextInt();
            int m = Sc.nextInt();
            long ar[] = new long[n];
            for (int i = 0; i < n; i++) {
                ar[i] = Sc.nextLong();
            }
            long ar1[] = new long[m];
            long ar2[] = new long[m];
            for (int i = 0; i < m; i++) {
                ar1[i] = Sc.nextLong();
                ar2[i] = Sc.nextLong();
            }
            Arrays.sort(ar);
            for (int i = 0; i < m - 1; i++) {
                for (int j = i + 1; j < m; j++) {
                    if (ar2[i] < ar2[j]) {
                        long t = ar2[j];
                        ar2[j] = ar2[i];
                        ar2[i] = t;
                        long p = ar1[j];
                        ar1[j] = ar1[i];
                        ar1[i] = p;
                    }
                }
            }
            int q = 0;
            outer:
            for (int i = 0; i < m; i++) {
                while (ar1[i] != 0) {
                    if (ar[q] < ar2[i]) {
                        ar[q] = ar2[i];
                        q++;
                    } else
                        break outer;
                    ar1[i]--;
                }
            }
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum = sum + ar[i];
            }
            System.out.println(sum);
        } catch (Exception e) {
            return;
        }
    }
}
