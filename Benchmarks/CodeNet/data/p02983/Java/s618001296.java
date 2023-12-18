import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        int ans = Integer.MAX_VALUE;
        for (int i = L; i <= R; i++) {
            for (int j = i + 1; j <= R; j++) {
                int current = (i * j) % 2019;
                ans = Math.min(ans, current);
            }
        }
        System.out.println(ans);
    }
}
