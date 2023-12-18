import java.util.*;
import java.lang.*;

import static java.lang.StrictMath.abs;

class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        String a2 = a.substring(0,1);
        String b2 = b.substring(0,1);
        String c2 = c.substring(0,1);
        char[] a3 = a2.toCharArray();
        char[] b3 = b2.toCharArray();
        char[] c3 = b2.toCharArray();
        System.out.print(a3[0] + 32 );
        System.out.print(b3[0] +32);
        System.out.println(c3[0] + 32);
        



    }
}