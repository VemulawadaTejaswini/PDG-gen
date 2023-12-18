import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        String T = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        if (S.length() < T.length()) {
            System.out.println("UNRESTORABLE");
            return;
        }


        for (int i = S.length() - T.length(); i >= 0; i--) {
            if (check(i, S, T)) {
                answers(i, S, T);
                return;
            }
        }

        System.out.println("UNRESTORABLE");

    }

    private static boolean check(int x, String a, String b) {
        for (int i = 0; i < b.length(); i++) {
            if (a.charAt(x) != b.charAt(i) && a.charAt(x) != '?')
                return false;
            x++;
        }
        return true;
    }

    private static void answers(int start, String a, String b) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            if (i == start) {
                sb.append(b);
                i += b.length();
            } else if (a.charAt(i) == '?') {
                sb.append('a');
            } else {
                sb.append(a.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }

}
