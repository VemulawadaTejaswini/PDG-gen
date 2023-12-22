import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(true){
            int a = in.nextInt();
            String op = in.next();
            if(op.equals("?")) break;
            int b = in.nextInt();
            if(op.equals("+")) System.out.println(a+b);
            if(op.equals("-")) System.out.println(a-b);
            if(op.equals("*")) System.out.println(a*b);
            if(op.equals("/")) System.out.println(a/b);
        }
    }
}