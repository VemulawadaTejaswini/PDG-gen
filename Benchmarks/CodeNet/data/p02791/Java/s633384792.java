import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] p = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int ans = 0;
        int stac = 0;
        for (int i = 0; i < n; i++) {
            if (p[i] == stac+1) stac++;
            if (n - p[i] < i || p[i] > stac) continue;
            for (int j = 0; j <= i; j++) {
                if (p[i] > p[j]) break;
                if (i == j) ans++;
            }
        }
        System.out.println(ans);
    }
}