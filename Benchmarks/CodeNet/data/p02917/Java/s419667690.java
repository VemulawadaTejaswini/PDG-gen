import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[n-1];
        int ans = 0;
        for (int i = 0; i < n-1; i++) {
            b[i] = sc.nextInt();
            if(i == 0) ans += b[0];
            else ans += Math.min(b[i-1], b[i]);
        }
        if(2 <= n)ans += b[n-2];
        System.out.println(ans);
        sc.close();

    }

}
