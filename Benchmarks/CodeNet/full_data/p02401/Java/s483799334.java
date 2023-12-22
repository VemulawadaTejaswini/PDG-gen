import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char op = sc.nextCharactor();
        if (op == '?') {
            System.out.println("Error.");
            System.exit();
        }
        int b = nextInt();
        if (b == 0) {
            if (op == '/') {
                System.out.println("Error.");
                System.exit();
            }
        }
        System.out.println(a + op + b);
    }
}
