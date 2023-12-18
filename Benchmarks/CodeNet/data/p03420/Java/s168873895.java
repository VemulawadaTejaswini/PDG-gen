import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long ans = 0L;
        for (int i = k+1; i <= n; i++) {
            ans += (i-k)*(n/i);
            ans += Math.max(0, n%i-k+1);
        }
        if(k==0)ans = n*n;
        System.out.println(ans);
        sc.close();

    }

}
