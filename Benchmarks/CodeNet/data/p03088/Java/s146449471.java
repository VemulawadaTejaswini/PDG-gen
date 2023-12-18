import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long l = 1000000007;
        long ans = 230 * (n - 3);
        if(n == 3) {
            System.out.println(61);
            return;
        }
        for(int i = 0; i < n - 4; i++) {
            ans *= 4;
            ans %= l;
        }
        System.out.println(ans);
    }
}
