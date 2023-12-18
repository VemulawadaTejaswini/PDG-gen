import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S  = sc.nextLine();
        String T = sc.nextLine();

        HashMap<Character, Character> stmap = new HashMap<>();
        HashMap<Character, Character> tsmap = new HashMap<>();

        for (int i = 0; i < S.length(); i++) {
            if (stmap.containsKey(S.charAt(i)) && stmap.get(S.charAt(i)) != T.charAt(i)) {
                System.out.println("No");
                return;
            }

            if (tsmap.containsKey(T.charAt(i)) && tsmap.get(T.charAt(i)) != S.charAt(i)) {
                System.out.println("No");
                return;
            }

            stmap.put(S.charAt(i), T.charAt(i));
            tsmap.put(T.charAt(i), S.charAt(i));
        }

        System.out.println("Yes");
    }
}