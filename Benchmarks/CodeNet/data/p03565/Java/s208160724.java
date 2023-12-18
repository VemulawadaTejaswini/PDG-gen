import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s2 = in.next();
        String t = in.next();

        if (s2.length() < t.length()) {
            System.out.println("UNRESTORABLE");
            return;
        }
        
        for (int i = s2.length() - t.length(); i >= 0; i--) {
            if (canPlace(s2.substring(i, i + t.length()), t)) {
                for (int j = 0; j < s2.length(); j++) {
                    if (j >= i && j < i + s2.length()) {
                        System.out.print(t.charAt(j - i));
                    } else if (s2.charAt(j) == '?') {
                        System.out.print('a');
                    } else {
                        System.out.print(s2.charAt(j));
                    }
                }
                return;
            }
        }

        System.out.println("UNRESTORABLE");
    }
    
    static boolean canPlace(String s, String t) {
        if (s.length() < t.length()) {
            return false;
        }

        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(i) == '?') {
                continue;
            }

            if (s.charAt(i) != t.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}