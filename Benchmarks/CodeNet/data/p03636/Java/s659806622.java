import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final String S = sc.next();

        System.out.print(S.charAt(0));
        System.out.print(S.length() - 2);
        System.out.println(S.charAt(S.length()-1));
    }
}
