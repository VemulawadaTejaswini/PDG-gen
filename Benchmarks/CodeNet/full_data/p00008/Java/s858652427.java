import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] list = new int[4];
            int count = 0;
            for (int i = n < 28 ? 0 : n - 27; i <= Math.min(n, 9); i++) {
                if (n - i > 27) {
                    continue;
                }
                for (int j = n < 28 ? 0 : n - 27; j <= Math.min(n - i, 9); j++) {
                    if (n - i - j > 18) {
                        continue;
                    }
                    for (int k = n < 28 ? 0 : n - 27; k <= Math.min(n - i - j, 9); k++) {
                        if (n - i - j - k > 9) {
                            continue;
                        }
                        list[0] = i;
                        list[1] = j;
                        list[2] = k;
                        list[3] = n - i - j - k;
                        if (list[3] < 10 && sum(list) == n) {
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        }

        sc.close();
    }

    static int sum(int[] list) {
        return Arrays.stream(list).sum();
    }
}
