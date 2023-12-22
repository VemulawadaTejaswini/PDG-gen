import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int max = 0;
        for (int i = 0; i <= s.length() - t.length(); i++) {
            int cnt = 0;
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i + j) == t.charAt(j)) {
                    cnt++;
                }
            }
            max = Math.max(max, cnt);
        }
        System.out.println(t.length() - max);
    }
}