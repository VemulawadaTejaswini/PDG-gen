import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();

        String answer = "Yes";
        if (inputString.length() % 2 == 0) {
            answer = "No";
        } else {
            String firstPart = inputString.substring(0, inputString.length() / 2);
            String secondPart = inputString.substring((inputString.length() / 2) + 1);
            if (!firstPart.equals(secondPart)) {
                answer = "No";
            } else {
                char[] chars = firstPart.toCharArray();
                for (int i = 0; i < chars.length / 2; i++) {
                    if (chars[i] != chars[chars.length - (i + 1)]) {
                        answer = "No";
                        break;
                    }
                }
            }
        }

        System.out.println(answer);
    }
}