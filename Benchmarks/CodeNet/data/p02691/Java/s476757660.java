import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        Map<Integer, Integer> A = new LinkedHashMap<>();
        for (int i = 0; i < N; i++) {
            A.put(i + 1, scanner.nextInt());
        }

        int result = 0;
        for (int i = 1; i < N + 1; i++) {
            for (int j = i; j < N - 1; j++) {
                if (i == j) {
                    continue;
                }
                if (A.get(i) + A.get(j) == Math.abs(i - j)) {
                    result += 1;
                }
            }
        }
        System.out.println(result);
    }
}