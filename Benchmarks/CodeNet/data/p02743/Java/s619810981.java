import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        int count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double dMax = Double.MIN_VALUE;
        double dMin = Double.MAX_VALUE;
        //
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        double aa = Math.sqrt(a);
        double bb = Math.sqrt(b);
        double cc = Math.sqrt(c);

        if (a >= c || b>=c) System.out.println("No");
        else if (aa+bb < cc) System.out.println("Yes");
        else System.out.println("No");
        sc.close();
    }
}