import java.util.*;

public class Main {

    private static int N;
    private static int M;
    private static int[][] s;
    private static int[] p;

    private static void read() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        s = new int[M][];
        for (int m = 0; m < M; m += 1) {
            int k = sc.nextInt();
            int[] sm = new int[k];
            for (int ki = 0; ki < k; ki += 1) {
                sm[ki] = sc.nextInt();
            }
            s[m] = sm;
        }
        p = new int[M];
        for (int m = 0; m < M; m += 1) {
            p[m] = sc.nextInt();
        }
    }

    public static void main(String[] args) {
        read();

        int cnt = 0;
        for (int bit = 0; bit < (1 << N); bit += 1) {
            List<Integer> switches = new LinkedList<>();
            for (int s = 0; s < N; s += 1) {
                if ((bit & (1 << s)) != 0) {
                    switches.add(s + 1);
                }
            }
            cnt += isOn(switches);
        }

        System.out.println(cnt);
    }

    private static int isOn(List<Integer> switches) {
        for (int m = 0; m < M; m += 1) {
            int cnt = 0;
            for (int s : s[m]) {
                cnt += switches.contains(s) ? 1 : 0;
            }
            if (cnt % 2 != p[m]) {
                return 0;
            }
        }
        return 1;
    }

}

