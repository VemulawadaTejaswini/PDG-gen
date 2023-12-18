import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.solve();
    }
    public void solve() throws Exception {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        long[] a_f = new long[N + 1];
        long[] a_b = new long[N + 1];
        for (int i = 0; i < N + 1; i++) {
            a_f[i] = scan.nextLong();
            a_b[i] = a_f[i];
        }
        long[] b = new long[N + 1];
        for (int i = 0; i < N; i++) {
            b[i] = scan.nextLong();
        }
        long answer = front(N, a_f, b);
        answer = Math.max(answer,back(N, a_b, b));
        System.out.println(answer);
    }
    private long front(int N, long[] a, long[] b) {
        long answer = 0;
        for (int i = 0; i < N; i++) {
            answer += Math.min(b[i],a[i]);
            long t = Math.max(0, b[i]-a[i]);
            answer += Math.min(a[i+1], t);
            a[i+1] = Math.max(0, a[i+1]-t);
        }
        return answer;
    }
    private long back(int N, long[] a, long[] b) {
        long answer = 0;
        for (int i = N-1; 0 <= i; i--) {
            answer += Math.min(b[i],a[i+1]);
            long t = Math.max(0, b[i]-a[i+1]);
            answer += Math.min(a[i], t);
            a[i] = Math.max(0, a[i]-t);
        }
        return answer;
    }
}
