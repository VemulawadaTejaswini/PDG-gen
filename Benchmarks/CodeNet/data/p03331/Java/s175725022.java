import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= n / 2; i++) {
            min = Math.min(min, getDigitSum(i) + getDigitSum(n - i));
        }
       System.out.println(min);
    }
    
    static int getDigitSum(int x) {
        int ans = 0;
        while (x > 0) {
            ans += x % 10;
            x /= 10;
        }
        return ans;
    }
}
