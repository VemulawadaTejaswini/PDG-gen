import java.util.Scanner;

public class Main
{
    public static void main(String... args)
    {
        final Scanner scanner = new Scanner(System.in);
        final int in = scanner.nextInt();
        System.out.println((int) Math.pow(in, 3));
    }
}