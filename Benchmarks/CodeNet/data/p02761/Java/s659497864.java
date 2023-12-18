import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = 0;
        }

        for (int i = 0; i < m; i++) {
            int s = scanner.nextInt();
            int c = scanner.nextInt();

            if (result[s - 1] == 0) {
                result[s - 1] = c;
            } else if (result[s - 1] != c) {
                System.out.println(-1);
                return;
            }
        }

        if (n > 1 && result[0] == 0 && m > 0) {
            System.out.println(-1);
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(result[i]);
        }
        System.out.println(Integer.parseInt(sb.toString()));
    }
}
