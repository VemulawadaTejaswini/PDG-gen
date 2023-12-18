import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        int q = scan.nextInt();
        int r = scan.nextInt();

        if (Math.max(Math.max(p, q), r) == p) {
            System.out.println(q + r);
        } else if (Math.max(Math.max(p, q), r) == q) {
            System.out.println(p + r);
        } else {
            System.out.println(p + q);
        }
    }
}