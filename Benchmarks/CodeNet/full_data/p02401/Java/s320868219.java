import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        while (true) {
            // read line
            int a = scanner.nextInt();
            String op = scanner.next();
            int b = scanner.nextInt();
            
            if ("?".equals(op)) {
                break;
            }
            
            // calc output
            switch(op) {
                case "+":
                    sb.append(a + b).append("\n");
                    break;
                case "-":
                    sb.append(a - b).append("\n");
                    break;
                case "*":
                    sb.append(a * b).append("\n");
                    break;
                case "/":
                    if (a % b == 0) { 
                        sb.append(a / b).append("\n"); 
                    } else {
                        long adivb = (long)Math.floor(a / b);
                        sb.append(adivb).append("\n"); 
                    }
                    break;
                default:
                    break;
            }
        }
        
        System.out.print(sb);
    }
    
}
