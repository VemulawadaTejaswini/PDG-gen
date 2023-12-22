
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int k = 0;
        int best = 0;
        int n = scan.nextInt();

        while (n != 0) {
            for (int i = 0; i < n; i++) {
                int p = scan.nextInt();
                int b = scan.nextInt();
                int c = scan.nextInt();

                if (best <= b + c) {
                    best = b + c;
                    k = p;

                }

            }
            System.out.println(k + " " + best);
            k = 0;
            best = 0;
            n = scan.nextInt();
        }
    }
}

