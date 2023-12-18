import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String txt = scan.nextLine();

        HashMap<Character, Boolean> hash = new HashMap<Character, Boolean>();

        for (int i=0; i < txt.length(); i++) {
            if (hash.containsKey(txt.charAt(i))) {
                hash.remove(txt.charAt(i));
            } else {
                hash.put(txt.charAt(i), true);
            }
        }

        if (hash.size() == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
