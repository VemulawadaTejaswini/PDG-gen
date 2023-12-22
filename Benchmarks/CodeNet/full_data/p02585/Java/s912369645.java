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
        Score s = new Score();
        s.start = start;
        s.P = P;
        s.C = C;
        s.goal = start;
        s.score = 0L;
        for (int l=1; l<=K; l++) {
            s = s.next();
            result = max(result, s.score);
        }
        return result;
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

class Score {
    int start;
    int[] P;
    long[] C;
    int goal;
    long score;
   
    Score next() {
        Score score = new Score();
        score.start = this.start;
        score.P = this.P;
        score.C = this.C;
        score.goal = this.P[this.goal];
        score.score = this.score + this.C[this.P[this.goal]];
        return score;
    }

}