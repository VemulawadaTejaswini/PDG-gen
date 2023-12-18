import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        if (n == 1 && m == 1) {
            System.out.println(1);
        } else if (n == 1 || m == 1) {
            if (n > 1) {
                System.out.println(n - 2);
            } else {
                System.out.println(m - 2);
            }
        } else {
            System.out.println((n - 2) * (m - 2));
        }
    }
}