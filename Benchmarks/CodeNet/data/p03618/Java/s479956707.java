import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        char[] s = scanner.next().toCharArray();
        long ans = s.length * (s.length - 1) / 2 + 1;
        int[] count = new int[26];
        for (char c : s) {
            count[c - 'a']++;
        }
        for (int a : count) {
            ans -= a * (a - 1) / 2;
        }
        System.out.println(ans);
    }
}