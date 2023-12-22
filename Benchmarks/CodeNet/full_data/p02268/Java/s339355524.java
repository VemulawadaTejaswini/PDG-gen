import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] s = scanInt(scanner, n);

        int q = scanner.nextInt();
        int[] t = scanInt(scanner, q);

        System.out.println(IntStream.of(t).map(i -> binarySearch(s, i)).sum());
    }

    private static int binarySearch(int[] s, int key) {
        int left = 0;
        int right = s.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (s[mid] == key) {
                return 1;
            } else if (s[mid] > key) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return 0;
    }

    private static int[] scanInt(Scanner scanner, int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = scanner.nextInt();
        return a;
    }
}

