import java.util.*;

public class StringTransformation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();

        Map<Character, Character> sToT = new HashMap<>();
        Map<Character, Character> tToS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (sToT.containsKey(curr) && t.charAt(i) != sToT.get(curr)) {
                System.out.println("No");
                return;
            }
            else {
                sToT.put(curr, t.charAt(i));
            }
        }

        for (int i = 0; i < t.length();  i++) {
            char curr = t.charAt(i);
            if (tToS.containsKey(curr) && s.charAt(i) != tToS.get(curr)) {
                System.out.println("No");
                return;
            }
            else {
                tToS.put(curr, s.charAt(i));
            }
        }

        System.out.println("Yes");
    }
}
