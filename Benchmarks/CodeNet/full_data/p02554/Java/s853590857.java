import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long mod = 1000000007;
        long ten = 1;
        for (int i = 0; i < N; i++) {
            ten *= 10;
            ten %= mod;
        }
        long nine = 1;
        for (int i = 0; i < N; i++) {
            nine *= 9;
            nine %= mod;
        }
        long eight = 1;
        for (int i = 0; i < N; i++) {
            eight *= 8;
            eight %= mod;
        }
        long ans = (ten-nine-nine+eight)%mod;
        System.out.println(ans);
    }
    
}