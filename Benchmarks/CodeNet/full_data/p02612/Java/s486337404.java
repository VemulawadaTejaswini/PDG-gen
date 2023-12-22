import java.util.Scanner;

public class t1
{


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(1000-(x%1000));

    }
}