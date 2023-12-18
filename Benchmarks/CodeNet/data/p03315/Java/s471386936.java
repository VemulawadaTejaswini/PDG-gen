import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        String s = sc.next();
        for (int i = 0; i < 4; i++) {
            if (s.charAt(i) == '+') {
                ans++;
            } else {
                ans--;
            }
        }
        System.out.println(ans);
    }
}


