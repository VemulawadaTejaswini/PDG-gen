import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] words = {"eraser", "dreamer", "erase", "dream"};

        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();

        String answer = "YES";
        while (S.length() > 0) {
            boolean isMatch = false;
            for (String word : words) {
                if (S.endsWith(word)) {
                    isMatch = true;
                    S = S.substring(0, S.lastIndexOf(word));
                    break;
                }
            }
            if (!isMatch) {
                answer = "NO";
                break;
            }

        }

        System.out.format(answer);
    }
}