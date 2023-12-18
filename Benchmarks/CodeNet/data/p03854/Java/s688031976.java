import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] strings = new String[]{
            "dream",
            "dreamer",
            "erase",
            "eraser"
        };

        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        int restLength = S.length();
        int length = 0;
        while (true) {
            for (int i = 0; i < strings.length; i++) {
                if ((S.substring(0, restLength)).endsWith(strings[i])) {
                    length = strings[i].length();
                    break;
                }
            }
            if (length == 0) {
                System.out.println("NO");
                System.exit(0);
            }
            restLength -= length;
            if (restLength == 0) {
                System.out.println("YES");
                System.exit(0);
            }
            length = 0;
        }
    }
}
