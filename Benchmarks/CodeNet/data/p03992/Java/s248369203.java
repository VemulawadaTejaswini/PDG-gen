import java.util.Scanner;

/**
 * Created on 16/09/24.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        String result = S.substring(0, 4) + " " + S.substring(4);
        System.out.println(result);
    }
}
