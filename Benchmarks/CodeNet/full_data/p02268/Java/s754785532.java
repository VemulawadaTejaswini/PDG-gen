import java.util.Scanner;

public class Main {
    static boolean binary_search (int x, int[] data) {
        int left = 0, right = data.length;
        while (true) {
            int mid = (left + right) / 2;

            if (left > right) return false;

            if (data[mid] == x) {
                return true;
            } else if (data[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] s = new int[n];
        for (int i = 0; i < n; ++i) {
            s[i] = scanner.nextInt();
        }

        int q = scanner.nextInt();

        int cnt = 0;
        for (int i = 0; i < q; ++i) {
            int t = scanner.nextInt();
            if (binary_search(t, s)) ++cnt;
        }

        System.out.println(cnt);
    }
}
