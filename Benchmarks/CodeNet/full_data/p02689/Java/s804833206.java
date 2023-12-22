import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        Map<Integer, Integer> H = new HashMap<>();
        Map<Integer, Boolean> check = new HashMap<>();

        for (int i = 0; i < N; i++) {
            H.put(i + 1, scanner.nextInt());
            check.put(i + 1, true);
        }
        System.out.println(H);

        for (int i = 0; i < M; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            if (H.get(A) > H.get(B)) {
                check.put(B, false);
            } else if (H.get(A) < H.get(B)) {
                check.put(A, false);
            }
        }

        int result = 0;
        for (Integer integer : check.keySet()) {
            if (check.get(integer).equals(false)) {
                result += 1;
            }
        }

        System.out.println(result);
    }
}