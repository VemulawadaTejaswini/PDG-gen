import java.util.Scanner;

/**
 * Created by ??\??? on 2016/12/2.
 */
public class Main {
    static int gcd(int a,int b)
    {
        while(b!=0)
        {
            int ans = a%b;
            a = b;
            if(ans!=0)
            {
                b = ans;
            }
            else
            {
                return a;
            }
        }
        return -1;
    }
    static int run(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext())
        {
            String[] lines = scan.nextLine().split(" ");
            int a = Integer.parseInt(lines[0]);
            int b = Integer.parseInt(lines[1]);
            System.out.println(gcd(a,b));
        }
        return 0;
    }
    public static void main(String[] args)
    {
        run(args);
    }
}