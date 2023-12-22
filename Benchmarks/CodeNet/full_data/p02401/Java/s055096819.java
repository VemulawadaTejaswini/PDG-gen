import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        
        for(;;){
            Scanner scan = new java.util.Scanner(System.in);
            int a = scan.nextInt();
            String op = scan.next();
            int b = scan.nextInt();
            if(op == "+"){
               System.out.println(a + b);
            }else if(op.equals("-")){
               System.out.println(a - b);
            }else if(op.equals("*")){
               System.out.println(a * b);
            }else if(op.equals("/")){
               System.out.println(a / b);
            }else if(op.equals("?")){
                break;
            }
        }
    }
}