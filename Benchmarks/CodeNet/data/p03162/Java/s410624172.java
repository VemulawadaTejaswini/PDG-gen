
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = in.nextInt();
        int[][] days = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                days[i][j] = in.nextInt();
            }
        }
        int[] max = new int[3];
        max[0] = days[0][0];
        max[1] = days[0][1];
        max[2] = days[0][2];
        for (int i = 1; i < n; i++) {
            int a = days[i][0] + Math.max(max[1], max[2]);
            int b = days[i][1] + Math.max(max[0], max[2]);
            int c = days[i][2] + Math.max(max[0], max[1]);

            max[0] = a;
            max[1] = b;
            max[2] = c;
        }

        System.out.println(Math.max(max[2], Math.max(max[0], max[1])));
    }
}
