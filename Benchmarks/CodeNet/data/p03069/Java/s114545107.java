import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();

        int ans = 0;
        boolean hasBlack = false;

        for (char c : s) {
            if (hasBlack && c == '.') {
                ans++;
            } else if (!hasBlack && c == '#') {
                hasBlack = true;
            }
        }
        System.out.println(ans);
    }
}