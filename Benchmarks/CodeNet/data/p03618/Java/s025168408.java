import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        int[] count = new int[28];
        for (char ch : a.toCharArray()) {
            count[ch - 'a']++;
        }
        long ans = 1;
        for (int i = 1; i < a.length(); i++) {
            ans += i;
        }
        for (int val : count) {
            if (val > 1) {
                int d = 0;
                for (int i = 1; i < val; i++) {
                    d += i;
                }
                ans -= d;
            }
        }
        System.out.println(ans);
    }
}