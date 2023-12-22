import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        while(n-- != 0)
        {
            double x1 = stdIn.nextDouble();
            double y1 = stdIn.nextDouble();
            double x2 = stdIn.nextDouble();
            double y2 = stdIn.nextDouble();
            double x3 = stdIn.nextDouble();
            double y3 = stdIn.nextDouble();
            double x4 = stdIn.nextDouble();
            double y4 = stdIn.nextDouble();
            if(x1 == x2 && x3 == x4)
            {
                System.out.println("YES");
            }
            else if(x1 == x2 || x3 == x4)
            {
                System.out.println("NO");
            }
            else
            {
                double a1 = (y2 - y1) / (x2 - x1);
                double a2 = (y4 - y3) / (x4 - x3);
                if(a1 == a2)
                {
                    System.out.println("YES");
                }
                else
                {
                    System.out.println("NO");
                }
            }
        }
    }
}