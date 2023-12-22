//package Test;

import java.util.*;

public class Main {

    static class Solution {
        int mod = 1000000007;
        int quickPower(int a, int b) {
            int ans = 1;
            int base = a;
            while(b > 0) {
                if(b % 2 == 1) ans = ans * base % mod;
                base = base * base % mod;
                b >>= 1;
            }
            return ans;
        }

        void solve(int n){
            int ans = quickPower(10, n) - 2 * quickPower(9, n) + quickPower(8, n);
            ans = ans % mod;
            if(ans < 0) ans += mod;
            System.out.println(ans);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Solution solution = new Solution();
        solution.solve(n);

    }
}
