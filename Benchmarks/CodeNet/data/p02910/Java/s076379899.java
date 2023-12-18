import java.util.Scanner;

public class Main {
    public static boolean tapDance(String S) {
        for (int i = 1; i < S.length() + 1; i++) {
            char cur = S.charAt(i - 1);
            if (cur == 'U' || cur == 'D') continue;
            if ((i % 2 == 0 && cur != 'L') || (i % 2 == 1 && cur != 'R')) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        System.out.println(tapDance(S) ? "Yes" : "No");
    }
}
