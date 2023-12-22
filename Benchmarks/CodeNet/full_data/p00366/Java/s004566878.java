import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), max = 0, ans = 0;
        List<Integer> l = new ArrayList<>();
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
            max = Math.max(max, t[i]);
        }
        for (int i = 1; i <= max; i++) {
            if (max % i == 0) {
                l.add(i);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < l.size(); j++) {
                if (l.get(j) >= t[i]) {
                    ans += l.get(j) - t[i];
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
