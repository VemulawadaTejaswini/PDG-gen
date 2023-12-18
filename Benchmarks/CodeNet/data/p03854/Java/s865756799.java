import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();

        if (search(S)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    static boolean search(String s) {
        if (s.isEmpty()) {
            return true;
        }
        boolean found = false;
        if (s.startsWith("dream")) {
            found = search(s.substring("dream".length()));
        }
        if (!found && s.startsWith("dreamer")) {
            found = search(s.substring("dreamer".length()));
        }
        if (!found && s.startsWith("eraser")) {
            found = search(s.substring("eraser".length()));
        }
        if (!found && s.startsWith("erase")) {
            found = search(s.substring("erase".length()));
        }
        return found;
    }
}