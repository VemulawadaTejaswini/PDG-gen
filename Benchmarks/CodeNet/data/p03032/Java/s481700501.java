import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int K = scan.nextInt();
        int[] V = new int[N];
        for (int i = 0; i < N; i++) {
            V[i] = scan.nextInt();
        }
        int[] sumL = new int[N+1];
        sumL[0] = 0;
        for (int i = 0; i < N; i++) {
            sumL[i+1] = sumL[i] + V[i];
        }
        int[] sumR = new int[N+1];
        sumR[0] = 0;
        for (int i = 0; i < N; i++) {
            sumR[i+1] = sumR[i]+V[N-i-1];
        }
        int[] leftP = new int[N];
        for (int i = 0; i < K; i++) {
            if (N <= i) {
                break;
            }
            if (V[i] < 0) {
                leftP[i] = V[i];
            }
        }
        int[] rightP = new int[N];
        for (int i = 0; i < K; i++) {
            if (N - i - 1 < 0) {
                break;
            }
            if (V[N - i - 1] < 0) {
                rightP[i] = V[N - i - 1];
            }
        }
        int answer = Integer.MIN_VALUE;
        // 何も処理しない
        answer = Math.max(answer, 0);
        // 左からK個全部取る
        // 左からK-1個取得して1個戻す
        // 左からK-2個取得して2個戻す
        int onlyL = left(N, K, sumL, leftP);
        answer = Math.max(answer, onlyL);
        // 右からK個全部取る
        // 右からK-1個取得して1個戻す
        // 右からK-2個取得して2個戻す
        int onlyR = right(N, K, sumR, rightP);
        answer = Math.max(answer, onlyR);
        for (int i = 1; i < K; i++) {
            int LandR = left_and_right(N, K, i, sumL, leftP, sumR, rightP);
            answer = Math.max(answer, LandR);
        }
        System.out.println(answer);
    }
    private int right(int N, int maxR, int[] sumR, int[] rightP) {
        int maxanswer = Integer.MIN_VALUE;
        for (int i = maxR; 0 < i; i--) {
            int temp = sumR[Math.min(N, i)];
            if (i < maxR) {
                PriorityQueue<Integer> rightQ = new PriorityQueue<>(Comparator.naturalOrder());
                for(int j = 0; j < i ; j++) {
                    if (rightP[j] < 0) {
                        rightQ.add(rightP[j]);
                    }
                }
                for (int j = 0; j < maxR - i; j++) {
                    if (rightQ.isEmpty()) {
                        break;
                    }
                    temp -= rightQ.poll();
                }
            }
            maxanswer = Math.max(maxanswer, temp);
        }
        return maxanswer;
    }
    private int left(int N, int maxL, int[] sumL, int[] leftP) {
        int maxanswer = Integer.MIN_VALUE;
        for (int i = maxL; 0 < i; i--) {
            int temp = sumL[Math.min(N, i)];
            if (i < maxL) {
                PriorityQueue<Integer> leftQ = new PriorityQueue<>(Comparator.naturalOrder());
                for(int j = 0; j < i; j++) {
                    if (leftP[j] < 0) {
                        leftQ.add(leftP[j]);
                    }
                }
                for (int j = 0; j < maxL - i; j++) {
                    if (leftQ.isEmpty()) {
                        break;
                    }
                    temp -= leftQ.poll();
                }
            }
            maxanswer = Math.max(maxanswer, temp);
        }
        return maxanswer;
    }
    private int left_and_right(int N, int K, int maxL, int[] sumL, int[] leftP, int[] sumR, int[] rightP) {
        int maxanswer = Integer.MIN_VALUE;
        int maxLanswer = Integer.MIN_VALUE;
        int maxRanswer = Integer.MIN_VALUE;
        for (int i = maxL; 0 < i; i--) {
            int tempL = sumL[Math.min(N, i)];
            if (i < maxL) {
                PriorityQueue<Integer> leftQ = new PriorityQueue<>(Comparator.naturalOrder());
                for(int j = 0; j < i; j++) {
                    if (leftP[j] < 0) {
                        leftQ.add(leftP[j]);
                    }
                }
                for (int j = 0; j < maxL - i; j++) {
                    if (leftQ.isEmpty()) {
                        break;
                    }
                    if (leftP[j] < 0) {
                        tempL -= leftQ.poll();
                    }
                }
            }
            maxLanswer = Math.max(maxLanswer, tempL);
            for (int j = K - maxL; 0 < j; j--) {
                int tempR = sumR[Math.min(N, j)];
                if (j < K - maxL) {
                    PriorityQueue<Integer> rightQ = new PriorityQueue<>(Comparator.naturalOrder());
                    for(int k = 0; k < j; k++) {
                        if (rightP[k] < 0) {
                            rightQ.add(rightP[k]);
                        }
                    }
                    for (int k = 0; k < K - maxL - j; k++) {
                        if (rightQ.isEmpty()) {
                            break;
                        }
                        tempR -= rightQ.poll();
                    }
                }
                maxRanswer = Math.max(maxRanswer, tempR);

            }
            maxanswer = Math.max(maxanswer, maxLanswer+maxRanswer);
        }
        return maxanswer;

    }
}

