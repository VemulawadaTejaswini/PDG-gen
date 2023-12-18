import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();

        int ans = 0;
        boolean hasBlack = false;

        int blackCount = 0;

        for (int i = 0; i < s.length; i++) {
            if (hasBlack && s[i] == '.') {
                ans++;
            }
            if (s[i] == '#') {
                if (i != s.length - 1) {
                    blackCount++;
                }
                if (!hasBlack) {
                    hasBlack = true;
                }
            }
        }

        System.out.println(Math.min(ans, blackCount));
    }
}