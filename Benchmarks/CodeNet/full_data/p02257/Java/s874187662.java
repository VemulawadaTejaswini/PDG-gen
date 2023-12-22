import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tempI = 2, tempJ = 2;
        // 素数の数
        int count = 0;
        // 素数
        Set<Integer> primeNumbers = new HashSet<>();

        int n = sc.nextInt();
        for (int k = 0; k < n; k++) {
            int a = sc.nextInt();

            // 素数かチェック
            if (primeNumbers.contains(a)) {
                count++;
                continue;
            }

            // わかっている素数の中の倍数かチェック
            boolean multipleOf = false;
            for (int pn : primeNumbers) {
                if ((a % pn) == 0) {
                    multipleOf = true;
                    break;
                }
            }
            if (multipleOf) continue;

            // 素数を探す
            for (int i = tempI; i < a; i++) {
                tempI = i;
                int j;
                for (j = tempJ; j < i; j++) {
                    tempJ = j;
                    if ((i % j) == 0) break;
                }
                if ((i == j) && (a == i)) {
                    primeNumbers.add(a);
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}
