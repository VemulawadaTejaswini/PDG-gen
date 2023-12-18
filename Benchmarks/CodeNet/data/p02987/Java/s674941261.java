import java.util.Scanner;

public class Main {
    public static String solve(StringBuilder s) {
        char ch = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                s.deleteCharAt(i);
                s.deleteCharAt(0);
                if (s.charAt(0) == s.charAt(1))
                    return "Yes";
            }
        }
        return "No";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder();
        s.append(sc.next());
        System.out.println(solve(s));
    }
}
