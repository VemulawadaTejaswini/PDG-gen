
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        if (a == b && c == d || b == c && a == d || a == c && b == d) {
            System.out.println("yes");

        } else {
            System.out.println("no");
        }

    }

}

