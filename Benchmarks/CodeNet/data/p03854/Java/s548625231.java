import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] words = {"", "dream", "dreamer", "erase", "eraser"};

        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();

        String answer = "NO";

        loop: for (int a = 0; a < 5; a++) {
            for (int b = 0; b < 5; b++) {
                for (int c = 0; c < 5; c++) {
                    for (int d = 0; d < 5; d++) {
                        for (int e = 0; e < 5; e++) {
                            String T = words[a] + words[b] + words[c] + words[d] + words[e];
                            if(S.equals(T)) {
                                answer = "YES";
                                break loop;
                            }
                        }
                    }
                }
            }
        }
        System.out.format(answer);
    }
}