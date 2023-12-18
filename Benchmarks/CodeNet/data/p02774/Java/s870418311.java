import java.util.Scanner;
import java.util.Arrays;;

class Solver {
    public void Solve() {
        int n = sc.nextInt();
        int k = sc.nextInt();
        long a[] = new long[n];
        int neg = 0;
        int zero = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextLong();
            if (a[i] <= 0) {
                neg++;
            }
            if (a[i] == 0) {
                zero++;
            }
        }
        Arrays.sort(a);
        int posi = n - neg;
        if (k <= posi * neg) {
            // k番目は0以下
            long[] seki = new long[posi * neg];
            for (int i = 0; i < neg; i++) {
                for (int j = neg; j < a.length; j++) {
                    seki[i * posi + (j - neg)] = a[i] * a[j];
                }
            }
            Arrays.sort(seki);
            System.out.println(seki[k]);
        } else {
            // k番目は正の数
            int num = (neg - zero) * (neg - zero - 1) / 2 + posi * (posi - 1) / 2;
            long[] seki = new long[num];
            int cnt = 0;
            for (int i = 0; i < neg - zero; i++) {
                for (int j = i + 1; j < neg - zero; j++) {
                    seki[cnt] = a[i] * a[j];
                    cnt++;
                }
            }
            for (int i = neg; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    seki[cnt] = a[i] * a[j];
                    cnt++;
                }
            }
            Arrays.sort(seki);
            int b = zero * (zero - 1) / 2 + (zero) * (neg - zero) + neg * posi;
            System.out.println(seki[k - b - 1]);
        }

    }

    Scanner sc;

    Solver(Scanner in) {
        this.sc = in;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solver s = new Solver(sc);
        s.Solve();
        sc.close();
    }
}
