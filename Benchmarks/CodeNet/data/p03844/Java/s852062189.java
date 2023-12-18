import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        String op = in.next();
        int b = in.nextInt();
        
        if(op == "+")   System.out.println(a + b);
        else            System.out.println(a - b);
    }
}
