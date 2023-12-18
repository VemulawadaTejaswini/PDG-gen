import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        String s = scanner.next();
        int[] count = new int[3];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        Arrays.sort(count);
        System.out.println(count[2] - count[0] < 2 ? "YES" : "NO");
    }
}