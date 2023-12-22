import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());

        if (k <= a + b) {
            if (k >= a) {
                System.out.println(a);
            } else {
                System.out.println(k);
            }
        } else {
            System.out.println(a - (k - a - b));
        }

        sc.close();
    }
}