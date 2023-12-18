import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] road = new int[n];
        Arrays.fill(road, 0);

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            road[a - 1]++;
            road[b - 1]++;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(road[i]);
        }
    }
}
