import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!

        Scanner sc = new Scanner(System.in);
        

    while (sc.hasNextLine()) {
        
        int a = sc.nextInt();
        String op = sc.next();
        int b = sc.nextInt();
        
         if(op.equals("+")){
            System.out.println(a+b);
            
         }else if(op.equals("-")){
            System.out.println(a-b);
             
         }else if(op.equals("*")){
             System.out.println(a*b);

        }else if(op.equals("/")){
             System.out.println(a/b);
        }else{
             break;
        }
    }
    }
}


