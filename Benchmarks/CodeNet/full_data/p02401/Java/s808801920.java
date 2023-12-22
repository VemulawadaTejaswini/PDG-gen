import java.util.*;

class Main {
    
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            String op = scanner.next();
            int b = scanner.nextInt();
            
            try {
                switch (op) {
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
                }
                
                if (op == "?") {
                    break;
                }
            } catch (ArithmeticException e) {
                System.out.println(e);
                System.exit(0);
            }
        }
        
    }
    
}