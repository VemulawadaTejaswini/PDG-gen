import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;
        String op;

        a = scan.nextInt(); op = scan.next(); b = scan.nextInt();

        int ans;

        if (op.equals("+")) {
            ans = a + b;
        } else if (op.equals("-")) {
            ans = a - b;
        } else if (op.equals("*")) {
            ans = a * b;
        } else {
            ans = a / b;
        }

        System.out.println(ans);
    }
}