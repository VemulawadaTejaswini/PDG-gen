import java.util.*;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        int a = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'W') {
                ans += (i - a);
                a++;
            }
        }
        System.out.println(ans);
    }
}
