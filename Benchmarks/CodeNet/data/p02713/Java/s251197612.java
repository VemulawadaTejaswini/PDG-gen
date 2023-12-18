

import java.util.Scanner;

public class Main {
    static class Solution {
        public void find(int k) {
            long res = 0;
            for(int a=1; a<=k; a++) {
                for(int b=1; b<=k; b++) {
                    for(int c=1; c<=k; c++) {
                        res += gcd(a,gcd(b,c));
                    }
                }
            }
            System.out.println(res);

        }

        int gcd(int a, int b)
        {
            if (a == 0)
                return b;
            if (b == 0)
                return a;

            // base case
            if (a == b)
                return a;

            if (a > b)
                return gcd(a-b, b);
            return gcd(a, b-a);
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        sol.find(k);
    }
}
