import java.util.Scanner;

/**
 * Created by zzt on 17-1-15.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int[] x = new int[n];

        int ret = 0;

        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }

        int endDistance = b/a;
        if (b<a)
            ret = x[n-1]*b;
        else {
            int distance;
            for (int i = 0; i < n-1; i++) {
                distance = x[i + 1] - x[i];
                if (distance<=endDistance)
                    ret += a*distance;
                else
                    ret += b;
            }
        }
        System.out.println(ret);
    }
}
