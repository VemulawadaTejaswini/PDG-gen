import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        System.out.println(answer(n, s));
        sc.close();
    }

    private static String answer(int n, String s) {
        if ((n % 2) != 0) {
            return "No";
        }
        String first = s.substring(0, n / 2);
        String last = s.substring((n / 2));
        if (first.equals(last)) {
            return "Yes";
        }
        return "No";
    }
}
