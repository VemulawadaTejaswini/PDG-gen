import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> primeList = primeFactorizationAsMap(n);
        if (primeList.size() == 0) {
            System.out.println(0);
        } else {
            int result = primeList.values().stream()
                    .mapToInt(v -> {
                        int count = 0;
                        while (v > 0) {
                            v = v - count - 1;
                            if (v >= 0) {
                                count++;
                            }
                        }
                        return count;
                    })
                    .sum();
            System.out.println(result);
        }
    }

    private static Map<Integer, Integer> primeFactorizationAsMap(int num) {
        if (num < 2) {
            return new HashMap<>();
        } else {
            Map<Integer, Integer> result = new HashMap<>();
            int temp = num;
            double sqrt = Math.sqrt(num);
            for (int i = 2; i <= sqrt; i++) {
                int count = 0;
                while (temp % i == 0) {
                    count++;
                    temp = temp / i;
                }
                if (count != 0) {
                    result.put(i, count);
                }
            }
            if (result.size() == 0) {
                result.put(num, 1);
            }
            return result;
        }
    }
}
