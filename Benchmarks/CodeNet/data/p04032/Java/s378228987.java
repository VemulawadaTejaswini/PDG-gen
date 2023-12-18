import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                System.out.println((i + 1) + " " + (i + 2));
                return;
            } else if (s.charAt(i) == s.charAt(i + 2)) {
                System.out.println((i + 1) + " " + (i + 3));
                return;
            }
        }
        if (s.charAt(s.length() - 2) == s.charAt(s.length() - 1)) {
            System.out.println((s.length() - 1) + " " + s.length());
            return;
        }
        System.out.println("-1 -1");
    }

}
