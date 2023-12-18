import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        scanner.nextLine();
        int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        if (n[0] != 0 || Arrays.stream(n).filter(x -> x == 0).count() > 1) {
            System.out.println(0);
        }
        Arrays.sort(n);

        int index = 1;
        int num = 1;
        int pcnt = 1;
        int cnt = 0;
        long ans = 1;
        while (index < n.length) {
            while (index < n.length && n[index] == num) {
                cnt++;
                index++;
            }
            if (cnt == 0) {
                System.out.println(0);
                return;
            }
            for (int i = 0; i < cnt; i++) {
                ans = (ans * (long) pcnt) % 998244353;
            }
            pcnt = cnt;
            cnt = 0;
            num++;
        }
        System.out.println(ans);
    }

}