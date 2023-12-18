import java.util.*;

public class Main {
    static int MOD = 1000000007;
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        String str2 = sc.next();
        char[][] c = new char[2][n];
        for (int i = 0; i < n; i++) {
            c[0][i] = str.charAt(i);
        }
        for (int i = 0; i < n; i++) {
            c[1][i] = str2.charAt(i);
        }
        
        long ans = 1;
        int offset = 0;
        int type = 0;
        if (c[0][0] == c[1][0]) {
            ans *= 3;
            offset++;
            type = 1;
        } else {
            ans *= 6;
            offset += 2;
            type = 2;
        }
        
        for (int i = 0 + offset; i < n; i++) {
            if (c[0][i] == c[1][i]) {
                if (type == 1) {
                    ans *= 2;
                    ans %= MOD;
                } else {
                    ans *= 1;
                    ans %= MOD;
                }
                type = 1;
            } else {
                if (type == 1) {
                    ans *= 2;
                    ans %= MOD;
                } else {
                    ans *= 3;
                    ans %= MOD;
                }
                type = 2;
                i++;
            }
        }
        System.out.println(ans);
    }
}
