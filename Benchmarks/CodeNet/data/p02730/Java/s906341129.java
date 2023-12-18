
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String result = (isReversible(text) && isReversible(text.substring((text.length() + 2) / 2))) ? "Yes" : "No";

        System.out.println(result);
    }

    private static boolean isReversible(String text) {
        return text.equals(new StringBuilder(text).reverse().toString());
    }
}
