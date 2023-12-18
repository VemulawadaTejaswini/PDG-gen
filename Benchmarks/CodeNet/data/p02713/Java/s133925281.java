
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();

        int ans = 0;
        for (int i = 1; i <=K ; i++) {
            for (int j = 1; j <= K; j++) {
                for (int k = 1; k <=K ; k++) {
                    ans += gcd(gcd(i,j),k);
                }
            }
        }
        System.out.println(ans);
    }

    static int gcd(int a, int b ){
        if (a == 0)
            return b;

        return gcd(b%a, a);
    }

}
