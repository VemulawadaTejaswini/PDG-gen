import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);;

    public static void main(String[] args) {
        String S = sc.next();
        if (S.charAt(2) == S.charAt(3) && S.charAt(4) == S.charAt(5)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
