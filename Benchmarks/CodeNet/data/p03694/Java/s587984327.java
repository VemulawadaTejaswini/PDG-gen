import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 座標数
        int dataCount = sc.nextInt();
        int[] points = new int[dataCount];

        for (int i = 0; i < dataCount; i++) {
            points[i] = sc.nextInt();
        }

        Arrays.sort(points);

        // 最大座標 - 最小座標 = 最短の移動距離
        System.out.println(points[points.length - 1] - points[0]);
    }
}