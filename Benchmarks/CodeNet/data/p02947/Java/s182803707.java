import java.util.*;
import java.lang.*;

public class ABC137C {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        
        for (int i = 0; i < n; i++) {
            char[] c = sc.next().toCharArray();
            Arrays.sort(c);
            s[i] = new String(c);
        }

        Arrays.sort(s);
        
        int cnt = 0;
        long ans = 0;
        
        for (int i = 1; i < n; i++) {
            if (s[i - 1].equals(s[i])) {
                cnt++;
            } else {
                ans += cnt * (cnt + 1) / 2;
                cnt = 0;
            }
            //System.out.println(cnt);
        }
        ans += cnt * (cnt + 1) / 2;
        //System.out.println("---");
        System.out.println(ans);
    }
}
