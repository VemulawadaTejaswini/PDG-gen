import java.math.*;
import java.util.*;

public class Main {
    static String rev(String str) {
        StringBuffer sb = new StringBuffer(str);
        String tmp = sb.reverse().toString();
        return tmp;
    }

    static String ape(String str, String c) {
        StringBuffer sb = new StringBuffer(str);
        String tmp = sb.append(c).toString();
        return tmp;
    }

    static String ins(String str, String c) {
        StringBuffer sb = new StringBuffer(str);
        String tmp = sb.insert(0, c).toString();
        return tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans = sc.next();
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int t = sc.nextInt();
            if (t == 1) {
                ans = rev(ans);
            } else {
                int f = sc.nextInt();
                String c = sc.next();
                if (f == 1) {
                    ans = ins(ans, c);
                } else {
                    ans = ape(ans, c);
                }
            }
        }
        System.out.println(ans);
    }
}