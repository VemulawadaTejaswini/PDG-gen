
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final String s = in.next();
        final String t = in.next();
        int count = 0;
        for (int i = 0; i < 3; i++) {
            if (s.charAt(i) == t.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
