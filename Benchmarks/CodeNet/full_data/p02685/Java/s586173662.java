
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
        long ans = m;
        for (int i=1;i<n-k;i++){
            ans *= m-1;
            ans %= 998244353;
        }
        ans *= combination(n, k);
        ans %= 998244353;
        System.out.println(ans);
    }

    private static long combination(long n, long k){
        return k == 0 ? 1 : factorial(n) / (factorial(k) * factorial(n - k));
    }

    private static long factorial(long l){
        return l == 0 ? 1 : l * factorial(l-1);
    }

}
