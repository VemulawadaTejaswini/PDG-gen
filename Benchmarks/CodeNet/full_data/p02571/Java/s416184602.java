import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String t = scan.next();
        int ans = t.length();
        for (int i = 0; i + t.length() < s.length(); i++) {
           int tem = 0;
           for (int j = 0; j < t.length(); j++) {
               if (s.charAt(i + j) != t.charAt(j)) tem++;
           }
           ans = Math.min(ans, tem);
        }
        System.out.println(ans);
    }
}
