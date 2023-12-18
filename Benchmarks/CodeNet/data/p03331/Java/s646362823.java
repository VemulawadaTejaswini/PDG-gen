import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                int m = Integer.parseInt(s.substring(i, i+1));
                if (m == 1) {
                    ans += 10;
                }
            } else {
                int m = Integer.parseInt(s.substring(i, i+1));
                ans += m;
            }
        }
        System.out.println(ans);
    }
}
