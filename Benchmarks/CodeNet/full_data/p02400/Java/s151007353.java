import java.util.Scanner;

class main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double pi = Math.PI;

        double r = sc.nextDouble();

        double circle_main  = r * r * pi;
        double circle_round = 2 * r * pi;

        System.out.printf("%.6f %.6f", circle_main, circle_round);

    }
}