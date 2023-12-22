import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {

    static int gcd(int a, int b)
    {
        int t = a % b;
        while(t != 0)
        {
            a = b;
            b = t;
            t = a % b;
        }

        return b;
    }
    public static void main(String[] args)
    {
        int a, b, g;

        long l;

        Scanner cin = new Scanner(new BufferedInputStream(System.in));

        while(cin.hasNext())
        {
            a = cin.nextInt();
            b = cin.nextInt();

            g = gcd(a, b);
            l = 1L * a*b / g;
            System.out.print(g+" ");
            System.out.println(new Long(l).toString());
        }

    }
}

