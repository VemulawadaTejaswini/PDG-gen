import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());

        while (a > 0 && c > 0) {
            c -= b;
            if (c <= 0) {
                System.out.println("Yes");
                break;
            }
            a -= d;
            if (a <= 0) {
                System.out.println("No");
                break;
            }
        }

    }
}
