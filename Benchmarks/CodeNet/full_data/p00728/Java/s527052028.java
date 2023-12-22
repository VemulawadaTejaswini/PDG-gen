import java.util.Random;
import java.util.Scanner;

public class Main {
    static void swap(int[] data, int i, int j) {
        int tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            if (n == 0) break;

            int max = -1, min = 1001, sum = 0;
            for (int i = 0; i < n; i++) {
                int s = scanner.nextInt();
                max = Math.max(max, s);
                min = Math.min(min, s);
                sum += s;
            }
            System.out.println((int)((sum - max - min) / (double)(n - 2)));
        }
    }
}
