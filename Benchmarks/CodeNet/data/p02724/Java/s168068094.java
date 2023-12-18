import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int Q1 = x / 500;
        int R1 = x % 500;
        int Q2 = x / 5;
        int result = (Q1 * 1000) + Q2 * 5;
        System.out.println(result);
    }
}
