import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = 0;
        for (int i = 1; i < n + 1; i++) {
            for (int j = i; j < n + 1; j++) {
                for (int k = j; k < n + 1; k++) {
                    if (i == j && j == k) {
                        ans += gcd(gcd(i, j), k);
                    } else if (i == j || i == k || j == k) {
                        ans += gcd(gcd(i, j), k) * 3;
                    } else {
                        ans += gcd(gcd(i, j), k) * 6;
                    }
                }
            }
        }
        System.out.println(ans);
    }

    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}