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
        boolean badfound = false;
        int whitecount = 0;
        boolean blackfound = false;
        for (int i = 0; i < N; i++) {
            if (blackfound && data[i] == '.') {
                whitecount += 1;
            }
            if (i < N - 1 && data[i] == '#' && data[i+1] == '.') {
                badfound = true;
            }
            if (data[i] == '#') {
                blackfound = true;
                sum[i+1] += sum[i] + 1;
                continue;
            }
            sum[i+1] += sum[i];
        }
        if (badfound) {
            for (int i = 0; i < N; i++) {
                answer = Math.min(sub(N, sum, i + 1), answer);
            }
            answer = Math.min(whitecount, answer);
        } else {
            answer = 0;
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
