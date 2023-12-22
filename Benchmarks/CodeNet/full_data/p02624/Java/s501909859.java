import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 1;
        int[] counts = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j * i <= n; j++) {
                counts[j * i]++;
            }
            ans += i * (counts[i] + 1L);
        }
        System.out.println(ans);
    }
}