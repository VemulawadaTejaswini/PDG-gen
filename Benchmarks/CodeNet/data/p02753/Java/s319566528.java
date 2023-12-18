import java.util.*;

// "static void main" must be defined in a public class.
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        boolean a = false;
        boolean b = false;
        for (char c : input.toCharArray()) {
            if (c == 'A') a = true;
            if (c == 'B') b = true;
        }

        if(a && b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
