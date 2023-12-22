import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        int ans = 0;

        int rCount = 0;

        for (int i = 0; i < n; i++) {
            if (s[i] == 'R') {
                rCount++;
            }
        }
        for (int i = 0; i < rCount; i++) {
            if (s[i] == 'W') {
                ans++;
            }
        }

        System.out.println(Math.min(ans, rCount));
    }
}