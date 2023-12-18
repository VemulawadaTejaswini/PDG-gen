import java.util.Scanner;

public class Main{
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        int a = Integer.getInteger(in.next());
        String op = in.next();
        int b = Integer.getInteger(in.next());
        
        if(op.equals("+")){
            System.out.println(a + b);
        }else if(op.equals("-")){
            System.out.println(a - b);
        }
    }
}
