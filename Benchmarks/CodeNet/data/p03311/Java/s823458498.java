import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        long[] X = new long[N];
        for (int i = 0; i < N; i++) {
            X[i] = scan.nextLong() - i;
        }
        Arrays.sort(X);
        System.out.println(solve(N, X));
    }
    public static long solve(int N, long[] X) {
        long answer = (X[N-1] - X[0]) * N / 2;
        long left = X[0];
        long right = X[N-1];
        while (left + 2 < right) {
            long first_candidate = (right - left) / 3 + left;
            long second_candidate = (right - left) * 2 / 3 + left;
            long first_answer = cal(N, X, first_candidate);
            long second_answer = cal(N, X, second_candidate);
            if (first_answer < second_answer) {
                right = second_candidate;
                answer = second_answer;
            } else {
                left = first_candidate;
                answer = first_answer;
            }
        }
        answer = Math.min(answer, cal(N, X, left));
        answer = Math.min(answer, cal(N, X, left+1));
        answer = Math.min(answer, cal(N, X, left+2));
        return answer;
    }
    private static long cal(int N, long[] X, long b) {
        long answer = 0;
        for(long x : X) {
            answer += Math.abs(x - b);
        }
        return answer;
    }
}
