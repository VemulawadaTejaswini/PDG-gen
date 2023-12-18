import java.util.Scanner;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int A = s.nextInt();
        int B = s.nextInt();

        int sum = 0;

        if (B > 1)
        {
            while (true) {
                sum++;
                if ((A - 1) * (sum - 1) + A >= B) break;
            }
        }

        System.out.println(sum);
        s.close();
    }
}