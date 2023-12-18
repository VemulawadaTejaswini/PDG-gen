
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String key = "keyence";
        if (s.length() < key.length()) {
            System.out.println("NO");
            return;
        }
        int j = 0;
        boolean remove = false;
        int i = 0;
        for (; i < s.length() && j < key.length(); ) {
            if (s.charAt(i) != key.charAt(j)) {
                if (remove) {
                    System.out.println("NO");
                    return;
                } else {
                    while (i < s.length() && s.charAt(i) != key.charAt(j)) {
                        ++i;
                    }
                    if (i == s.length() && j == key.length() - 1) {
                        System.out.println("YES");
                        return;
                    }
                    remove = true;
                    ++j;
                    ++i;
                }
            } else {
                ++i;
                ++j;
            }
        }
        if (j == key.length()) {
            if ((i < s.length() && remove == false) || (i >= s.length())) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }
}
