import java.util.*;

    public class Main{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            int x = sc.nextInt();
            String op = sc.next();
            int y = sc.nextInt();

            if(op.equals("+")){
                System.out.println(x + y);
            }else if(op.equals("-")){
                System.out.println(x - y);
            }else if(op.equals("*")){
                System.out.println(x * y);
            }else if(op.equals("/")){
                System.out.println(x / y);
            }else if(op.equals("?")){
                break;              
            }
        }
    }
}
