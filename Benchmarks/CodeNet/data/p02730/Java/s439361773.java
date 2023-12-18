import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (!isKaibun(s.substring(0, s.length() / 2))) {
            System.out.println("No");
            return;
        }
        if (!isKaibun(s)) {
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
    }

    private static boolean isKaibun(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return s.equals(sb.toString());
    }
}