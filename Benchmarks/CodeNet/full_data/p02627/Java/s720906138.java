import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        sc.close();

        char s = a.toCharArray()[0];

        String res = "";
        if (Character.isLowerCase(s)) {
            res = "a";
        } else {
            res = "A";
        }

        System.out.println(res);

    }
}
