import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        char[] S = in.next().toCharArray();
        int ans = 0;
        for (int i = 0; i < S.length - 1; i++) {
            if (S[i] != S[i + 1]) {
                ans++;
            }
        }
        System.out.println(ans);
    }

    static final char B = 'B', W = 'W';
}