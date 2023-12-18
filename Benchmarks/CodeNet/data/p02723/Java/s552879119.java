import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final char[] chars = scanner.next().toCharArray();
        if (chars[2] == chars[3] && chars[4] == chars[5]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
