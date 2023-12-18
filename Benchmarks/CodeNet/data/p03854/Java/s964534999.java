import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();

        String[] match = { "dream", "dreamer", "erase", "eraser" };

        boolean next = true;
        while (next && N.length() > 0) {
            for (int i = 0; i < match.length; i++) {
                next = false;
                int lastIndex = N.lastIndexOf(match[i]);
                System.out.println(lastIndex);
                System.out.println(match[i].length());
                System.out.println(N.length());
                if (lastIndex + match[i].length() == N.length()-1) {
                    N.substring(lastIndex, N.length() - 1);
                    next = true;
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