import java.util.*;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        for (int i = 0 ; i < s.length() ; i++) {
            boolean f = true;
            for (int j = 0 ; j < s.length() ; j++) {
                if (s.charAt(j) != t.charAt(j+i)) {
                    f = false;
                    break;
                }
            }
            if (f) {
                System.out.println("Yes");
                System.exit(0);
            }
        }
        System.out.println("No");
    }
}