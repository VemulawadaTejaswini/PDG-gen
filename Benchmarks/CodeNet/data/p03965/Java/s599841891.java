import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    static void solve(Scanner in) {
        char[] S = in.next().toCharArray();
        int score = 0;
        for (int i = 0; i < S.length; i++) {
            if (i % 2 > 0) { // p
                if (S[i] == g)
                    score++;
            } else { // g
                if (S[i] == p)
                    score--;
            }
        }

        System.out.println(score);
    }

    static final char p = 'p';
    static final char g = 'g';

    // ggppgggpgg

    // count(p) <= count(g)
}