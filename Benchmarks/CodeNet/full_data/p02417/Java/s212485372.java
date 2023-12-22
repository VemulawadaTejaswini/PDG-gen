import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean f = true;
        int[] c = new int['z' - 'a' + 1];
        while (s.hasNext()) {
            String str = scan.next().toLowerCase();
            for (int i = 0; i < str.length(); i++) {
                if (Character.isLetter(str.charAt(i))) {
                    c[str.charAt(i) - 'a']++;
                }
            }
        }
        for (int i = 0; i < c.length; ++i) {
            System.out.printf("%c : %d\n", (char)('a' + i), c[i]);
        }
    }
}