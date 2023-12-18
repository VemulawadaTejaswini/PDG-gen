import java.util.*;
import java.util.regex.*;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final String S = sc.next();
        sc.close();

        Pattern p = Pattern.compile("^(dream|dreamer|erase|eraser)*");
        Matcher m = p.matcher(S);
        if (m.matches()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}