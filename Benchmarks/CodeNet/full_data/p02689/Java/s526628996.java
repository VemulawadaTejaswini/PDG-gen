
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: ngupta
 * Date: 5/5/2020 AD
 * Time: 00:33
 */
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] height = new int[N + 1];
        int[] ma = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            height[i] = sc.nextInt();
        }

        for (int i = 0; i < M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            ma[x] = Math.max(ma[x], height[y]);
            ma[y] = Math.max(ma[y], height[x]);
        }

        int count = 0;
        for (int i = 1; i < ma.length; i++) {
            if (height[i] > ma[i])
                count++;
        }

        System.out.println(count);
    }
}
