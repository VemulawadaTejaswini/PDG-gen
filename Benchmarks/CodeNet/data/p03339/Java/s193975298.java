
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        String s = std.next();
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int count = 0;
            String leftSub = s.substring(0, i);
            for (int j = 0; j < leftSub.length(); j++) {
                if (leftSub.charAt(j) == 'W') {
                    count++;
                }
            }

            String rightSub = s.substring(i + 1);
            for (int j = 0; j < rightSub.length(); j++) {
                if (rightSub.charAt(j) == 'E') {
                    count++;
                }
            }

            ans = Math.min(ans, count);
        }

        System.out.println(ans);
    }
}
