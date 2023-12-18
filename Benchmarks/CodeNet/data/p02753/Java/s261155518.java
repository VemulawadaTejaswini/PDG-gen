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
       int a = 0;
       int b=0;
       for (int i=0;i<s.length();i++)
       {
           if (s.charAt(i)=='A')
               a+=1;
           else
               b+=1;
       }
       if (a==2)
           System.out.println("YES");
       else
           System.out.println("NO");
    }
}
