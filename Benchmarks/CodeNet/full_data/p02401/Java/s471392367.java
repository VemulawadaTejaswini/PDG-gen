import java.util.*;
import java.text.*;

class Main {
    public static void main(String[]args)throws Exception {
        Scanner sc = new Scanner(System.in);
        for(;;) {
            int a = sc.nextInt();
            char c = sc.next().charAt(0);
            int b = sc.nextInt();
            int r = 0;
            if(c=='?') break;
            else if(c=='+') r = a + b;
            else if(c=='-') r = a - b;
            else if(c=='*') r = a * b;
            else if(c=='/') r = a / b;
            System.out.println(r);
        }
    }
}