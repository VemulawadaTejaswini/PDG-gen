import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] p = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int ans = 0;
        int index_1 = n;
        for (int i = 0; i < n; i++) {
            if (p[i] == 1) {
                index_1 = i;
                break;
            }
        }
        for (int i = 0; i <= index_1; i++) {
            for (int j = 0; j <= i; j++) {
                if (p[i] > p[j]) break;
                if (i == j) ans++;
            }
        }
        System.out.println(ans);
    }
}