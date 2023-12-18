import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int same = 0;
        int diff = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                diff++;
            } else same++;
        }

        if (same == s.length() - 1) {
            System.out.println(0);
        } else System.out.println(diff);
    }
}
