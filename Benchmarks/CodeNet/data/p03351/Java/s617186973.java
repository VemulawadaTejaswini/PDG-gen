import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.CharArrayReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
        boolean ab = false, ac = false, bc = false;
        if(((Math.abs(b-c)<=d)&&(Math.abs(a-b)<=d))||(Math.abs(a-c)<=d))System.out.println("Yes");
        else System.out.println("No");
    }
}
