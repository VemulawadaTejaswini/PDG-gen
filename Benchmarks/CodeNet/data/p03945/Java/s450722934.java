import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        for(int i = 1, l = s.length(); i < l; ++i) {
            if(s.charAt(i - 1) != s.charAt(i)) ++ans;
        }
        System.out.println(ans);
    }
}
