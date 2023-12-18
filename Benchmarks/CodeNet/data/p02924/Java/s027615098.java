import java.util.*;

public class Main {
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Long[] longs = new Long[n];
        for (int i = 0; i < n; i++){
            longs[i] = (i + 1L);
        }
        Long ans = 0L;
        Long max = 0L;
        for (int i  = 0; i < n; i++) {
            Long soezi = i + 1L;
            for (int j = 0; j < n; j++) {
                max = Math.max(max, longs[j] % soezi);
            }
            ans += max;
        }
        System.out.println(ans);
    }
}
