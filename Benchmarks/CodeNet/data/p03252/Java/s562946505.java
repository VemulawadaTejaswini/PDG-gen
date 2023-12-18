import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S  = sc.nextLine();
        String T = sc.nextLine();

        HashMap<Character, Character> map = new HashMap<>();
        Set<Character> li = new HashSet<>();

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == T.charAt(i)) {
                li.add(S.charAt(i));
                continue;
            }

            if (map.containsKey(S.charAt(i)) && map.get(S.charAt(i)) != T.charAt(i)) {
                System.out.println("No");
                return;
            }

            map.put(S.charAt(i), T.charAt(i));
        }

        for (int i = 0; i < S.length(); i++) {
            if (li.contains(T.charAt(i))) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}