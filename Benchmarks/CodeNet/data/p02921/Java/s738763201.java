import java.util.*;
import java.util.stream.*;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static int mod = (int)1e9 + 7;

    public static void main(String[] args) {
        String s = sc.next();
        String t = sc.next();
        int ans = 0;
        ans += s.charAt(0) == t.charAt(0) ? 1 : 0;
        ans += s.charAt(1) == t.charAt(1) ? 1 : 0;
        ans += s.charAt(2) == t.charAt(2) ? 1 : 0;
        System.out.println(ans);
    }

}
