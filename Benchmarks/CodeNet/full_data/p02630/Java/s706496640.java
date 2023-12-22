
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        Map<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        for (int i = 0 ; i < N ; i++) {
            int A = scanner.nextInt();
            sum += A;
            if (map.containsKey(A)) {
                map.put(A, map.get(A) + 1);
            } else {
                map.put(A, 1);
            }
        }

        int Q = scanner.nextInt();
        for (int i = 0 ; i < Q ; i++) {
            int B = scanner.nextInt();
            int C = scanner.nextInt();

            if (map.containsKey(B)) {
                int count = map.get(B);
                sum = sum - B * count + C * count;
                System.out.println(sum);
                map.put(B, 0);
                if (map.containsKey(C)) {
                    map.put(C, map.get(C) + count);
                } else {
                    map.put(C, count);
                }
            }
        }
    }
}
