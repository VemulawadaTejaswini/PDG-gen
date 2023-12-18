import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            String s = in.next();
            String t = in.next();
            for (int c = 0; c < 3; c++) {
                if (s.charAt(c) != t.charAt(2 - c)) {
                    System.out.println("No");
                    return;
                }
            }
            System.out.println("Yes");
        }
    }
}
