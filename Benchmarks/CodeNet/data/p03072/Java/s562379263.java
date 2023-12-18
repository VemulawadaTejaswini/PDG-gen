import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] mountains = new int[n];
        int cnt = 1;
        for (int i = 0; i < n; i++) {
            mountains[i] = Integer.parseInt(sc.next());
        }
        for (int i = n - 1; i > 0; i--) {
            if (mountains[i] >= mountains[0] && mountains[i] >= mountains[i - 1]) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
