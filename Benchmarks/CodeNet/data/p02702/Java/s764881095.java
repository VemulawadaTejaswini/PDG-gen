import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] count = new int[2019];
        int mul = 1;
        int ans = 0;
        int tmp = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            // T (n+1) = T (n) + 10 * An
            tmp = (tmp + mul * (s.charAt(i) - '0')) % 2019;
            ans += count[tmp];
            count[tmp]++;
            mul = mul * 10 % 2019;
        }
        System.out.println(ans);
    }
}