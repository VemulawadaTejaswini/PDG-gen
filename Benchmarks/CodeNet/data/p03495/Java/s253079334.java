import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        String[] A = new String[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.next();
        }

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            Integer count = map.get(A[i]);
            if (count != null) {
                count++;
                map.replace(A[i], count);
            } else {
                map.put(A[i], 1);
            }
        }

        int[] sum = { 0 };
        int[] count = { 0 };
        map.forEach((key, value) -> {
            count[0]++;
            if (count[0] > K) {
                sum[0] += value;
            }
        });

        System.out.printf("%d\n", sum[0]);
        sc.close();
    }
}