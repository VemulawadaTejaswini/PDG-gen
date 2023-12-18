import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < s.length() - 1; i++) {
            char a = s.charAt(i);
            char b = s.charAt(i + 1);
            if (a != b) {
                int min = Math.max(i + 1, s.length() - i - 1);
                if (min < ans) {
                    ans = min;
                }
            }
        }
        System.out.println(ans);
    }
}