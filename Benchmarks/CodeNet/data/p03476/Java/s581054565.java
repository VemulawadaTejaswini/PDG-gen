import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public void main(Scanner sc) {
        List<Integer> primeList = createPrime(100000);
        int like2017[] = new int[50000];
        for (int prime : primeList) {
            int tmp = (prime + 1) / 2;
            if (prime % 2 == 1 && primeList.contains(tmp)) {
                like2017[tmp] = 1;
            }
        }

        int sum = 0;
        for (int i = 0; i < 50000; i++) {
            sum += like2017[i];
            like2017[i] = sum;
        }

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            System.out.println(like2017[(r + 1) / 2] - like2017[(l - 1) / 2]);
        }
    }

    private List<Integer> createPrime(int n) {
        List<Integer> primeList = new ArrayList<>(Arrays.asList(2, 3, 5, 7));

        for (int i = 9; i <= n; i += 2) {
            boolean flag = true;
            for (long prime : primeList) {
                if (prime * prime > i) {
                    break;
                }
                if (i % prime == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                primeList.add(i);
            }
        }

        return primeList;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
