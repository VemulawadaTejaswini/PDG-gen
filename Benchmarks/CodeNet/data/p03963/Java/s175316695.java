import java.util.Scanner;

/**
 * B
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int result = k;
        for (int i = 1; i < n; i++) {
            result *= k - 1;
        }

        System.out.println(result);
        sc.close();
    }
}