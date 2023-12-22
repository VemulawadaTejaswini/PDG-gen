import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            String op = sc.next();
            int b = sc.nextInt();
            int ans = 0;

            switch (op) {
                case "+":
                    ans = a + b;
                    break;
                case "-":
                    ans = a - b;
                    break;
                case "*":
                    ans = a * b;
                    break;
                case "/":
                    ans = a / b;
                    break;
                case "?":
                    return;
            }

            System.out.println(ans);
        }
    }
}
