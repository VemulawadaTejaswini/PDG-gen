import javax.sql.XAConnection;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N + 1];

        for (int i = 1; i <= N; i++) {
            A[i] = sc.nextLong();
        }

        long count = 0;

        for (int i = 1; i <= N; i++) {
            long sum = 0;
            for (int j = i; j <= N; j++) {
                sum += A[j];
                if (sum == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}