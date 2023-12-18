import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        int b;
        int c;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        if ((a == b && a != c) || (b == c && b != a) || (a == c && b != a)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}