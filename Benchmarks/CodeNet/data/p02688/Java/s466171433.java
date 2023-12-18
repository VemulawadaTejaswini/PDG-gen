import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();


        Map<Integer, Boolean> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            map.put(i + 1, false);
        }

        for (int j = 0; j < K; j++) {
            int d = scanner.nextInt();
            for (int i = 0; i < d; i++) {
                map.put(scanner.nextInt(), true);
            }
        }

        int result = 0;
        for (Integer integer : map.keySet()) {
            if (map.get(integer).equals(false)) {
                result += 1;
            }
        }

        System.out.println(result);
    }
}