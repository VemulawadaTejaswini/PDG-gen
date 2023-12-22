import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        //入力準備
        Scanner sc = new Scanner(System.in);
        
        int a,b;
        String op;
        
        while(true){
            
            a = sc.nextInt();
            op = sc.next();
            b = sc.nextInt();
            
            if(op.equals("?")){
                break;
            }else if(op.equals("+")){
                System.out.println(a + b);
            }else if(op.equals("-")){
                System.out.println(a - b);
            }else if(op.equals("*")){
                System.out.println(a * b);
            }else if(op.equals("/")){
                System.out.println(a / b);
            }
        }
        
    }
}
