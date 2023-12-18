import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String S = scan.next(), T = scan.next();


        HashMap<Character, Character> table = new HashMap<Character, Character>();
        HashMap<Character, Character> r_table = new HashMap<Character, Character>();

        char s_ch, t_ch;
        for (int i=0; i<S.length(); i++) {
            s_ch = S.charAt(i);
            t_ch = T.charAt(i);

            if (table.get(s_ch) == null) {
                table.put(s_ch, t_ch);
            }
            if (r_table.get(t_ch) == null) {
                r_table.put(t_ch, s_ch);
            }

            if (table.get(s_ch) != t_ch || r_table.get(t_ch) != s_ch) {
                System.out.println("No");
                System.exit(0);
            }
        }

        System.out.println("Yes");
    }
}