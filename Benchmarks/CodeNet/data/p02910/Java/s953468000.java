import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] c = sc.next().toCharArray();
        List<Character> fumiyasuiKisu = new ArrayList<Character>(Arrays.asList('R', 'U', 'D'));
        List<Character> fumiyasuiGusu = new ArrayList<Character>(Arrays.asList('L', 'U', 'D'));
        String fumiyasui = "Yes";

        for (int i = 0; i < c.length; i++) {
            if ((i + 1) % 2 == 0) {
                if (!fumiyasuiGusu.contains(c[i])) {
                    fumiyasui = "No";
                    break;
                }
            } else {
                if (!fumiyasuiKisu.contains(c[i])) {
                    fumiyasui = "No";
                    break;
                }
            }
        }

        System.out.println(fumiyasui);
        sc.close();
    }
}