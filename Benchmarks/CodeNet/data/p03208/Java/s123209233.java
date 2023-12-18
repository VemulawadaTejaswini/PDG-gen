import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> h = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            h.add(sc.nextInt());
        }
        sc.close();

        Collections.sort(h);

        int ans = Integer.MAX_VALUE;
        for (int i = k - 1; i < n; i++) {
            int candidate = h.get(i) - h.get(i - (k - 1));
            if (candidate < ans) {
                ans = candidate;
            }
        }
        System.out.println(ans);

    }

}
