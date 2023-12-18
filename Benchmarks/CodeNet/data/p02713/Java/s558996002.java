import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();

        int result = (int) Math.pow(K, 3);

        for (int i = 2; i < K + 1; i++) {
            for (int j = 2; j < K + 1; j++) {
                for (int k = 2; k < K + 1; k++) {
                    List<Integer> cache = Arrays.asList(i, j, k);
                    cache.sort(Comparator.reverseOrder());
                    if (cache.get(0) % cache.get(2) == 0 && cache.get(1) % cache.get(2) == 0) {
                        result += cache.get(2);
                    } else {
                        result += 1;
                    }
                }
            }
        }
        System.out.println(result);
    }
}