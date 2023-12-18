import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a == b && b == c || a != b && b != c && c != a) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
