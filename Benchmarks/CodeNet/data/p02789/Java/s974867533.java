import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int m = read.nextInt();
        while (n<=100 && m<=n) {
            if (n == m)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
