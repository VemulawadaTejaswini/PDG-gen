import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        if (S.length()%2 == 1) {
            System.out.println("No");
            return;
        }

        boolean ans = true;
        for (int i = 0; i < S.length(); i+=2) {
            if (S.charAt(i) != 'h' || S.charAt(i+1) != 'i') {
                ans = false;
                break;
            }
        }

        System.out.println(ans ? "Yes" : "No");
    }
}
