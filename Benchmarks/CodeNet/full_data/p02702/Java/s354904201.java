import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int[] mod = new int[2019];
        mod[0]++;
        int now = 0;
        int d = 1;
        for (int i = S.length()-1; i >= 0; i--) {
            int a = S.charAt(i)-'0';
            now += d*a;
            now %= 2019;

            mod[now]++;

            d *= 10;
            d %= 2019;
        }

        long ans = 0;
        for (int i = 0; i < 2019; i++) {
            if (mod[i] > 1) {
                ans += (long)mod[i]*(mod[i]-1)/2;
            }
        }
        System.out.println(ans);
    }
}
