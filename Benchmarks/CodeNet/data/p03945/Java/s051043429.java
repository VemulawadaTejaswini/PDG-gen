import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] chars = sc.next().toCharArray();

        char current = chars[0];
        int ans = 0;
        for (int i = 1; i < chars.length; i++) {
            if (current != chars[i]) {
                ans++;
                current = chars[i];
            }
        }
        System.out.println(ans);
    }
}