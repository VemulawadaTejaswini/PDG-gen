import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    int           MAX        = 10000001;
    boolean       is_prime[] = new boolean[MAX];
    int           prime[]    = new int[MAX];
    List<Integer> primeList  = new ArrayList<Integer>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();
        main.calcPrime();
        while (scanner.hasNext()) {
            int ans = 0;
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            for (int i = 2; i < input; i++) {
                if (main.is_prime[i]) {
                    int b = input - i;
                    if (i > b) {
                        break;
                    }
                    if (main.is_prime[b]) {
                        ans++;
                    }
                }
            }
            System.out.println(ans);
        }
    }

    public void calcPrime() {
        int p = 0;
        for (int i = 0; i < MAX; i++)
            is_prime[i] = true;
        is_prime[0] = is_prime[1] = false;
        for (int i = 2; i < MAX; i++) {
            if (is_prime[i]) {
                prime[p++] = i;
                for (int j = 2 * i; j < MAX; j += i)
                    is_prime[j] = false;
            }
        }
    }
}