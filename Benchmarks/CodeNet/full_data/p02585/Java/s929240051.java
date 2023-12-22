
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner sc = new Scanner(is);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int P[] = new int[N];
        int C[] = new int[N];

        for(int i = 0; i < N; i++) {
            P[i] = sc.nextInt()-1;
        }
        for(int i = 0; i < N; i++) {
            C[i] = sc.nextInt();
        }

        long ans = Integer.MIN_VALUE;
        if(K <= N) {
            for(int i = 0; i < N; i++) {
                long max = getMax(P, C, i, K);
                ans = Math.max(ans, max);
            }
        } else {
            for(int i = 0; i < N; i++) {
                boolean visited[] = new boolean[N];
                int times[] = new int[N];
                long totalScore[] = new long[N];
                int pos = i;
                long sum = 0;
                int period = 1;
                for(int j = 0; j < K; j++) {
                    pos = nextKoma(P, pos);
                    if(visited[pos]) {
                        period = j - times[pos];
                        break;
                    }
                    visited[pos] = true;
                    long score = getScore(C, pos);
                    sum += score;
                    totalScore[pos] = sum;
                    times[pos] = j;
                }
                int lastTime = K - times[pos]-1;
                long diff = getScore(C, pos) + sum - totalScore[pos];
                if(diff > 0) {
                    long max = Math.max(0, getMax(P, C, pos, lastTime%period));
                    ans = Math.max(ans, totalScore[pos] + (lastTime/period) * diff + max);
                }
                ans = Math.max(ans, getMax(P, C, i, times[pos]+period));
            }
        }

        os.println(ans);
    }


    static int nextKoma(int P[], int now){
        return P[now];
    }
    static int getScore(int C[], int now) {
        return C[now];
    }


    static long getMax(int P[], int C[], int start, int K) {
        long max = Integer.MIN_VALUE;
        long sum = 0;
        int pos = start;
        for(int j = 0; j < K; j++) {
            //move
            pos = nextKoma(P, pos);
            long score = getScore(C, pos);
            sum += score;
            max = Math.max(max, sum);
        }
        return max;
    }
}