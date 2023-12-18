import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // long startTime = System.currentTimeMillis();

        Scanner scanner = new Scanner(System.in);

        int[] n = new int[3];
        n[0] = scanner.nextInt();
        n[1] = scanner.nextInt();
        n[2] = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        int maxIdx = 0;
        if (maxIdx < n[1]) {
            maxIdx = 1;
        }
        if (maxIdx < n[2]) {
            maxIdx = 2;
        }

        int d = (int) Math.pow(2, k);

        int result = 0;

        for (int i = 0; i < 3; i++) {
            result += (i == maxIdx) ? n[i] * d : n[i];
        }

        System.out.println(result);

        // System.out.println(System.currentTimeMillis() - startTime);
    }
}