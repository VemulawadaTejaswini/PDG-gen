import java.util.*;

public class Main {
    public static void main(String args[]) {
        FastScanner cin = new FastScanner();
        String s = cin.next();
        int score = 0;

        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == 'p') {
                if (i % 2 == 0)
                    --score;
            } else {
                if (i % 2 == 1)
                    ++score;
            }
        }

        System.out.println(score);
    }

    static class FastScanner {
        StringTokenizer tokenizer;
        Scanner scanner;

        FastScanner() {
            tokenizer = null;
            scanner = new Scanner(System.in);
        }

        int nextInt() {
            while (tokenizer == null || !tokenizer.hasMoreTokens())
                tokenizer = new StringTokenizer(scanner.nextLine());

            return Integer.parseInt(tokenizer.nextToken());
        }

        String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens())
                tokenizer = new StringTokenizer(scanner.nextLine());

            return tokenizer.nextToken();
        }
    }
}

