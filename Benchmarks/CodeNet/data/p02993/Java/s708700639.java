
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final String next = in.next();
        final char[] chars = next.toCharArray();

        char last = ' ';
        for (char aChar : chars) {
            if (aChar == last) {
                System.out.println("Bad");
                return;
            }
            last = aChar;
        }
        System.out.println("Good");
    }
}
