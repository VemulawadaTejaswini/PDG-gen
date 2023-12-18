import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int length = s.length();

        StringBuilder sb = new StringBuilder(s);

        int turn = 0; // 偶数 = 高橋, 奇数 = 青木

        int i = 1;
        while (i < length - 1) {
//            System.out.println(i + " : " + sb.toString());

            if (sb.length() <= 2) {
                // give up
                System.out.println((turn % 2 == 0) ? "Second" : "First");
                return;
            }

            if (sb.charAt(i - 1) == sb.charAt(i + 1)) {
                // とれない
//                System.out.println("とれない");
                sb.deleteCharAt(i);
                sb.deleteCharAt(i - 1);

                if (sb.length() <= 2) {
                    // give up
                    System.out.println((turn % 2 == 0) ? "Second" : "First");
                    return;
                }

                if (i >= length - 2) {
                    // give up
                    System.out.println((turn % 2 == 0) ? "Second" : "First");
                    return;
                }

            } else {
                // とれる
//                System.out.println("とれる");
                sb.deleteCharAt(i);
                turn++;
            }
        }
    }
}
