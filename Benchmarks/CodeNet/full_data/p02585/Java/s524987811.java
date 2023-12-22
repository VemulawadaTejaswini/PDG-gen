import java.util.*;
public class Main {
	public static void main(String[] args){
        Main main = new Main();
        main.input();
        main.solve();
        main.output();
    }

    int N;
    long K;
    int[] P;
    long[] C;
    boolean[] checked;
    long pointTotal;
    long k;
    long result;

    private void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextLong();
        P = new int[N];
        C = new long[N];
        checked = new boolean[N];
        for (int i=0; i<N; i++) {
            P[i] = sc.nextInt() - 1;
        }
        for (int i=0; i<N; i++) {
            C[i] = sc.nextLong();
            pointTotal += C[i]; 
        }
        result = 0;
    }

    private void solve() {
        result = C[0];
        for (int i=0; i<N; i++) {
            result = max(getMaxScore(i), result);
        }
    }

    private long getMaxScore(int start) {
        long result = -1000000000L;
        for (int l=1; l<=K; l++) {
            result = max(getScore(start,l), result);
        }
        return result;
    }

    private long getScore(int start, int length) {
        long score = C[start];
        int next = P[start];
        for (int i=0; i<length-1; i++) {
            score += C[next];
            next = P[next];
        }
        return score;
    }

    private long max(long l1, long l2) {
        if (l1 > l2) {
            return l1;
        } else {
            return l2;
        }
    }

    private long min(long l1, long l2) {
        if (l1 < l2) {
            return l1;
        } else {
            return l2;
        }
    }

    private void output() {
        System.out.println(result);
    }
}
