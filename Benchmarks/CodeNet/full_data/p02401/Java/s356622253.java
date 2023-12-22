import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        
        int answer; 
        try (Scanner sc = new Scanner(System.in)){
        while(true){
            int a = sc.nextInt();
            String op = sc.next();
            int b = sc.nextInt();
       

          
            switch (op){
                case "+":
                answer = a + b;
                break;
                case "-":
                answer = a - b;
                break;
                case "*":
                answer = a * b;
                break;
                case "/":
                answer = a / b;
                break;
                default:
                return;

            }
             
  
             System.out.println(answer);
        }
    
        }
        }
}
