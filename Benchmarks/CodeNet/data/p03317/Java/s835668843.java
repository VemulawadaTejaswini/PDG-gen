import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int K = scan.nextInt();
        int[] A = new int[N];
        int one_position = 0;
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
            if (A[i] == 1) {
                one_position = i;
            }
        }
        System.out.println(solve(N, K, A, one_position));
    }
    public static int solve(int N, int K, int[] A, int one_position) {
        if (N == K) {
            return 1;
        }
        int answer = both(N, K, one_position);
        answer = Math.min(answer, left(N, K));
        answer = Math.min(answer, right(N, K));
        return answer;
    }
    public static int both(int N, int K, int one_position) {
        int answer = 0;
        int current = one_position;
        while (0 < current) {
            answer += 1;
            current -= (K-1);
        }
        current = one_position;
        while (current < N - 1) {
            answer += 1;
            current += (K-1);
        }
        return answer;
    }
    public static int left(int N, int K) {
        int answer = 0;
        int current = 0;
        while (current < N - 1) {
            answer += 1;
            current += (K - 1);
        }
        return answer;
    }
    public static int right(int N, int K) {
        int answer = 0;
        int current = N - 1;
        while (0 < current) {
            answer += 1;
            current -= (K - 1);
        }
        return answer;
    }
}
