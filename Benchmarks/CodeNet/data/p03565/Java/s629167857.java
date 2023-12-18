import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();

        int index = S.length() - T.length();
        while (index >= 0) {
            int j;
            for (j = 0; j < T.length(); j++) {
                if (S.charAt(index + j) != T.charAt(j) && S.charAt(index + j) != '?'){
                    break;
                }
            }
            if (j == T.length()) {
                break;
            }
            index--;

        }
        if (index < 0) {
            System.out.println("UNRESTORABLE");
            return;
        }

        char[] c = S.toCharArray();
        for (int i = 0; i < T.length(); i++) {
            c[index + i] = T.charAt(i);
        }
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '?') {
                c[i] = 'a';
            }
        }
        System.out.println(c);
    }
}
