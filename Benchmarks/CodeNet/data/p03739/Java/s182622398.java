import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scan.nextInt();
        }
        long[] s = new long[N+1];
        s[0] = 0;
        for (int i = 0; i< N; i++) {
            s[i+1] = s[i] + a[i];
        }
        // 正、負、正
        long answer1 = solve(N, s, 1);
        // 負、正、負
        long answer2 = solve(N, s, 0);
        System.out.println(Math.min(answer1, answer2));
    }
    public static long solve(int N, long[] s, int pattern) {
        long answer = 0;
        long diff = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 2 == pattern) {
                if (0 < s[i]+diff) {
                    continue;
                } else {
                    answer += Math.abs(1-(s[i]+diff));
                    diff += (1 - (s[i]+diff));
                }
            } else {
                if (s[i]+diff < 0) {
                    continue;
                } else {
                    answer += Math.abs(s[i]+diff+1);
                    diff -= (s[i]+diff+1);
                }
            }
        }
        return answer;
    }
}
