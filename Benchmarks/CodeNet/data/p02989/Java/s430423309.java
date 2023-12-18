import java.util.*;

public class Main {
    long MOD = 1000000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n];
        for(int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }
        Arrays.sort(d);
        int t1 = d[n / 2];
        int t2 = d[n / 2 - 1];
        int ans = t1 - t2;
        System.out.println(ans);

    }
}