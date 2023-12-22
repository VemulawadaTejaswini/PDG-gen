import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        final double pi = 3.14159265359;
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        System.out.printf("%.5f", r * r * pi);
        System.out.print(" ");
        System.out.printf("%.5f", r * 2 * pi);
    }
}