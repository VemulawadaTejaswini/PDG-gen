import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());

        String[] values = scanner.nextLine().split(" ");
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(values[i]);
        }

        boolean can = true;
        for (int i = 0; i < N; i++) {

            int left = i == 0 ? a[N - 1] : a[i - 1];
            int right = i == (N - 1) ? a[0] : a[i + 1];
            int sum = left ^ right;
            if (a[i] != sum) {
                can = false;
            }

        }

        System.out.println(can ? "Yes" : "No");

        scanner.close();

    }

}
