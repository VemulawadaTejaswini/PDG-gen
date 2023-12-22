import java.util.Scanner;

class Main {
    private static void solve() {
        final Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            final String[] words = scanner.nextLine().split(" ");
            final String[] keywords = { "the", "this", "that" };

            for (int i = 0; i <= 'z' - 'a'; i++) {
                boolean flag = false;
                for (String word: words) {
                    char[] w = word.toCharArray();
                    for (int j = 0; j < w.length; j++) {
                        if (w[j] != '.') {
                            w[j] = (char) ('a' + (w[j] - 'a' + i) % 
                                    ('z' - 'a' + 1));
                            assert Character.isLetter(w[j]);
                        }
                    }
                    for (int j = 0; j < keywords.length; j++) {
                        if (String.valueOf(w).startsWith(keywords[j])) {
                            flag = true;
                        }
                    }
                }
                if (flag) {
                    boolean space = false;
                    for (String word: words) {
                        char[] w = word.toCharArray();
                        for (int j = 0; j < w.length; j++) {
                            if (w[j] != '.') {
                                w[j] = (char) ('a' + (w[j] - 'a' + i) %
                                        ('z' - 'a' + 1));
                            }
                        }
                        if (space) {
                            System.out.print(" ");
                        }
                        System.out.print(String.valueOf(w));
                        space = true;
                    }
                    System.out.println();
                }
            }
        }
    }

    public static void main(String... args) {
        solve();
    }
}