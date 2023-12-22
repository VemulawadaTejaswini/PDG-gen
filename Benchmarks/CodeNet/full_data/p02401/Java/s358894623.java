import java.util.*;
import java.math.*;
class Main {
    public static void main(String[] args) {
        Scanner scan_ = new Scanner(System.in);
        int a_ = 0;
        int b_ = 0;
        String op = null;
        while(scan_.hasNext()) {
            a_  = scan_.nextInt();
            switch(scan_.next()) {
                case "+":
                  b_  = scan_.nextInt();
                    System.out.println(a_  + b_);
                    break;
                case "-":
                    b_  = scan_.nextInt();
                    System.out.println(a_  - b_);
                    break;
                case "/":
                    b_  = scan_.nextInt();
                    System.out.println(a_  /  b_);
                    break;
                case "%":
                     b_  = scan_.nextInt();
                    System.out.println(a_  % b_);
                     break;
                 case "*":
                     b_  = scan_.nextInt();
                    System.out.println(a_  * b_);
                     break;
                case "?":
                    b_  = scan_.nextInt();
                    break;
            }
            
            
        }
        
        
    }
}

