import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        //long start = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        //long n = sc.nextLong();
        String s = sc.next();
        sc.close();

        int sum = 0;
        for (int i = 0;i<s.length();++i) sum += Integer.parseInt(s.substring(i,i+1));

        if (sum%9 == 0) System.out.println("Yes");
        else System.out.println("No");
//        long end = System.currentTimeMillis();
//        System.err.println((end-start)+"ms");
    }
}