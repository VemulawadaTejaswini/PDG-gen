import java.util.Scanner;

public class Main {
    
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String[] numbers = scanner.nextLine().split(" ");
            int a = Integer.parseInt(numbers[0]);
            String op = numbers[1];
            int b = Integer.parseInt(numbers[2]);

            if (op.equals("?")) {
                break;
            }
            
            switch(op) {
                case "+":
                    System.out.println(""+(a+b));
                    break;
                case "-":
                    System.out.println(""+(a-b));
                    break;
                case "*":
                    System.out.println(""+(a*b));
                    break;
                case "/":
                    System.out.println(""+(a/b));
                    break;
                default:
                    break;
            }
        }
    }
}
