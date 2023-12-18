import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        int n, k;
        n = scanner.nextInt();
        k = scanner.nextInt();
        var flag = new boolean[100];

        for (int i = 0; i < k; ++i) {
            int d = scanner.nextInt();
            for (int j = 0; j < d; ++j) {
                int a = scanner.nextInt();
                flag[a - 1] = true;
            }
        }

        var count = 0;
        for (int i = 0; i < n; ++i) {
            if (!flag[i]) {
                ++count;
            }
        }

        System.out.println(count);
    }
}
