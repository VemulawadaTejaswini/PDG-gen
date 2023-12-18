import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        char[] s = in.next().toCharArray();
        for (int i = 0; i < s.length; i++) {
            if (s[i] == A) {
                for (int j = s.length - 1; j > -1; j--) {
                    if (s[j] == Z) {
                        System.out.println(j - i + 1);
                        return;
                    }
                }
            }
        }
    }

    static final char A = 'A', Z = 'Z';
}