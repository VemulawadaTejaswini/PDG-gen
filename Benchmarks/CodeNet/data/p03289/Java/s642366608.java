import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        if (s.charAt(0) != 'A') {
            System.out.println("WA");
            return;
        }

        int count = 0;
        int pos = -1;
        for (int i = 2; i <= s.length() - 2; i++) {
            if (s.charAt(i) == 'C') {
                count++;
                pos = i;
            }
        }
        if (count != 1) {
            System.out.println("WA");
            return;
        }
        s = s.substring(1, pos) + s.substring(pos + 1, s.length());

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < 'a' || s.charAt(i) > 'z') {
                System.out.println("WA");
                return;
            }
        }

        System.out.println("AC");

    }
}
