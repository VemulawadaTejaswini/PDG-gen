import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String S = scan.next();
        String T = scan.next();
        boolean answer = solve(S, T);
        System.out.println(answer ? "Yes" : "No");
    }
    private static boolean solve(String S, String T) {
        char[] data_S = S.toCharArray();
        char[] data_T = T.toCharArray();
        boolean answer = false;
        int N = data_S.length;
        for (int m = 0; m < N; m++) {
            boolean same = true;
            for (int i = 0; i < N; i++) {
                if (i+m < N) {
                    if (data_S[i + m] != data_T[i]) {
                        same = false;
                        break;
                    }
                    continue;
                }
                if (data_S[i + m - N] != data_T[i]) {
                    same = false;
                    break;
                }
            }
            if (same) {
                return true;
            }
        }
        return false;
    }
}
