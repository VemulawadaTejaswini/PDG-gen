import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        String S = scan.next();
        char[] data = S.toCharArray();
        int[] sum = new int[N+1];
        Arrays.fill(sum, 0);
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            if (data[i] == '#') {
                sum[i+1] += sum[i] + 1;
                continue;
            }
            sum[i+1] += sum[i];
        }
        for (int i = 0; i <= N; i++) {
            answer = Math.min(sub(N, sum, i), answer);
        }
        System.out.println(answer);
    }
    public static int sub(int N, int[] sum, int from) {
        int blackcount_before_from = sum[from];
        int whitecount_before_from = from - sum[from];
        int whitecount_after_from = N - sum[N] - whitecount_before_from;
        return blackcount_before_from + whitecount_after_from;
    }
}
