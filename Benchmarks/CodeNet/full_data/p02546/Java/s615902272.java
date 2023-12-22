import java.math.BigDecimal;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        //long start = System.currentTimeMillis();
        final long MOD = (long)Math.pow(10,9)+7;
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder(s);
        if (s.substring(s.length()-1,s.length()) .equals("s")) sb.append("es");
        else sb.append("s");

        System.out.println(sb.toString());
        sc.close();
//        long end = System.currentTimeMillis();
//        System.err.println((end-start)+"ms");
    }
}