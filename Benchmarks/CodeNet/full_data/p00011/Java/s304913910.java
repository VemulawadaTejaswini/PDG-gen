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

        int w = scanner.nextInt(), n = scanner.nextInt();
        int[] data = new int[w];

        for (int i = 0; i < w; ++i) {
            data[i] = i + 1;
        }

        scanner.useDelimiter("[,\n]");
        for (int i = 0; i < n; ++i) {
            int a = scanner.nextInt(), b = scanner.nextInt();
            swap(data, a - 1, b - 1);
        }
        for (int i = 0; i < w; ++i) {
            System.out.println(data[i]);
        }
    }
}
