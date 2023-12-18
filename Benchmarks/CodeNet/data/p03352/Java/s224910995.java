import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        // long startTime = System.currentTimeMillis();

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        scanner.close();

        System.out.println(calc(x));

        // System.out.println(System.currentTimeMillis() - startTime);
    }

    private static int calc(int x) {
        int s = (int) Math.sqrt(x);
        int max = 1;
        for (int i = 2; i <= s; i++) {
            int j = i;
            int k = 2;
            while (j <= x) {
                if (max < j) {
                    max = j;
                }
                j = (int) Math.pow(i, k);
                k++;
            }
        }

        return max;
    }
}
