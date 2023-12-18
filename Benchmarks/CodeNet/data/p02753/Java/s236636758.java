import java.util.*;
public class Main {
//    public static long MIN(long a,long b,long c)
//    {
//        if (a < b && a<c)
//            return a;
//        else if (b < a && b < c)
//            return b;
//        else
//            return c;
//    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.contains("AAA") || s.contains("BBB"))
            System.out.println("NO");
        else
            System.out.println("YES");
    }
}
