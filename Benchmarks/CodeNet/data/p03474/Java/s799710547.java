
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s = sc.next();

        sc.close();

        String reg = "[0-9]+";

        if (s.substring(0, a).matches(reg)
                && s.substring(a, a + 1).equals("-")
                && s.substring(a + 1).matches(reg)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
