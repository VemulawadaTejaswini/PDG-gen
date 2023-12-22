import java.util.Scanner;
import java.lang.Math;

class Point
{
    double x;
    double y;
    Point(double x1, double y1)
    {
        x = x1;
        y = y1;
    }
}

class Main
{
    public static double deal(double x)
    {
        if (Math.abs(x) < 1e-6) return 0;
        else return x;
    }
    public static Point solve(double a, double b, double c,
                              double d, double e, double f)
    {
        Point p = new Point(0, 0);
        if (b == 0)
        {
            p.x = c / a;
            p.y = (f - d * p.x) / e;
        }
        else
        {
            p.x = (b * f - e * c) / (b * d - e * a);
            p.y = (c - a * p.x) / b;
        }
        p.x = deal(p.x);
        p.y = deal(p.y);
        return p;
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        while (input.hasNext())
        {
            double x[] = new double [6];
            for (int i = 0; i < 6; i++)
            {
                x[i] = input.nextDouble();
            }
            Point p = solve(x[0], x[1], x[2], x[3], x[4], x[5]);
            System.out.printf("%.3f %.3f\n", p.x, p.y);
        }
        input.close();
    }
}