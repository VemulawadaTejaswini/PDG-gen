import java.util.Arrays;
import java.util.Scanner;

public class Main {
    int n;
    int[] ns;

    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ns = new  int[n];
    }

    private void solve() {
        Arrays.fill(ns, 0);
        ns[1] = 1;
        for (int i = 2; i < n; i++) {
            if(ns[i] == -1) continue;
            if(gcd(i, n) != 1) {
                for (int j = i; j < n; j += i) {
                    ns[j] = -1;
                }
            }
            else {
                for (int j = i; j < n; j += i) {
                    if (ns[j] != -1)
                        ns[j] = 1;
                }
            }
        }
        int ans = 0;
        for (int n: ns)
            if(n==1) ans++;
        System.out.println(ans);
    }

    private int gcd(int a, int b) {
        int tmp;
        while (b != 0) {
           tmp = a;
           a = b;
           b = tmp % b;
        }
        return a;
    }
}