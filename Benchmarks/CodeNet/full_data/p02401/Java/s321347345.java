
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String[] a_op_b = sc.nextLine().split(" ");
            String op = a_op_b[1];
            int a = Integer.parseInt(a_op_b[0]);
            int b = Integer.parseInt(a_op_b[2]);
            switch(op) {
                case "+":
                    System.out.println(a + b);
                    break;
                case "-":
                    System.out.println(a - b);
                    break;
                case "*":
                    System.out.println(a * b);
                    break;
                case "/":
                    System.out.println(a / b);
                    break;
                default:
                    return;
            }
        }
    }
}

