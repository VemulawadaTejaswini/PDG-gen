import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        List<Integer> xs = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            xs.add(sc.nextInt());
        }


        int ans = 0;
        for (int x : xs) {
            ans += 2 * (Math.min(x, Math.abs(K - x)));
        }

        System.out.println(ans);
    }
}
