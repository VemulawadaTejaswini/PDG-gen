import java.util.Scanner;

public class Main2 {
    public static int main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer a = sc.nextInt();
        String op = sc.next();
        Integer b = sc.nextInt();

        if(op == null){
            System.out.printf("");
        } else switch (op) {
            case "+":
                System.out.printf("%d", a + b);
                break;
            case "-":
                System.out.printf("%d", a - b);
                break;
            case "/":
                System.out.printf("%d", a / b);
                break;
            case "*":
                System.out.printf("%d", a * b);
                break;
            default:
                System.out.printf("");
        }
        return  0;
    }
}