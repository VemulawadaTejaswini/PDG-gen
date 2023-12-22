import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();

        if (S.substring(0, S.length()).equals(T.substring(0, S.length()))
                && S.length() == T.length() - 1) {

            System.out.println("Yes");
            return;
        }

        System.out.println("No");
    }
}