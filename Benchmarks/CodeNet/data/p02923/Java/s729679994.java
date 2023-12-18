import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        int[] h;

        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        h = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int count = 0;
        int ans = 0;
        for (int i = 0; i < n - 1; i++) {
            if (h[i] >= h[i + 1]) {
                count++;
            } else {
                if (ans < count) ans = count;
                count = 0;
            }

            if (i == n - 2) {
                if (ans < count) ans = count;
            }
        }
        System.out.println(ans);
    }
}