import java.util.Scanner;

public class Competitive {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        if (S.charAt(2) == S.charAt(3) && S.charAt(4) == S.charAt(5)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
