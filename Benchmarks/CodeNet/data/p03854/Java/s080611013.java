import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();

        String[] match = { "dream", "dreamer", "erase", "eraser" };

        boolean next = true;
        while (next && N.length() > 0) {
            next = false;
            for (int i = 0; i < match.length; i++) {
                int lastIndex = N.lastIndexOf(match[i]);
                if (lastIndex + match[i].length() == N.length()-1) {
                    N.substring(lastIndex, N.length() - 1);
                    next = true;
                    break;
                }
            }
        }
        if (next) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}