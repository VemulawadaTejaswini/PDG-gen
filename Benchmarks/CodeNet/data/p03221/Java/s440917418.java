import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] cities = new int[M][3];

        for (int i = 0; i < M; i++) {
            int P = sc.nextInt();
            int Y = sc.nextInt();
            cities[i][0] = P;
            cities[i][1] = Y;
            cities[i][2] = i;
        }

        Arrays.sort(cities, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] != o2[0]) {
                    return o1[0] - o2[0];
                } else {
                    return o1[1] - o2[1];
                }
            }
        });

        int prevP = 0;
        int c = 0;
        int[][] ans = new int[M][2];
        for (int i = 0; i < M; i++) {
            int P = cities[i][0];
            int Y = cities[i][1];
            int city = cities[i][2];

            if (P != prevP) {
                prevP = P;
                c = 0;
            }
            c += 1;

            ans[city][0] = P;
            ans[city][1] = c;
        }

        for (int i = 0; i < M; i++) {
            System.out.println(String.format("%06d%06d", ans[i][0], ans[i][1]));
        }
    }
}
