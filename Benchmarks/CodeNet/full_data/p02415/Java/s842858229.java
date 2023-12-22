import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s, ans = "";

        s = scan.nextLine();
        for(int i = 0; i < s.length(); i++) {
            String a = s.substring(i, i + 1);
            char[] c = a.toCharArray();
            if(Character.isUpperCase(c[0])) {
                ans += a.toLowerCase();
            } else if(Character.isLowerCase(c[0])) {
                ans += a.toUpperCase();
            } else {
                ans += a;
            }
        }
        System.out.println(ans);
    }
}
