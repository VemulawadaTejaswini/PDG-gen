import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        String T = sc.next();
        int result = T.indexOf(S);

        if (result == 0 && S.length() + 1 == T.length()) {
            System.out.print("Yes");
        } else {
            System.out.println("No");
        }
    }
}