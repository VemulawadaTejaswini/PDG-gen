import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] c = s.toCharArray();
        int len = c.length;
        boolean[] b = new boolean[200];
        
        for (int i = 0; i < len; i++) {
            b[c[i]] = true;
        }
        String ans = "-1";
        if (len != 26) {
            ans = s + getCh(b, (char)0);
        } else {
            b[c[len-1]] = false;
            for (int i = c.length - 2; i >= 0; i--) {
                
                if (c[i] < c[i+1]) {
                    ans = s.substring(0, i) + getCh(b, c[i]);
                    break;
                }
                b[c[i]] = false;
            }
        }
        System.out.println(ans);
    }
    static String getCh(boolean[] b, char ch) {
        for (int i = 'a'; i <= 'z'; i++) {
            if (!b[i] && ch < i) return "" + (char) i;
        }
        return "";
    }
}
