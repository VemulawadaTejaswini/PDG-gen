import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] S = scanner.next().toCharArray();
        scanner.close();

        boolean[] has = new boolean[26];

        for (char c : S) {
            has[c - 'a'] = true;
        }

        for (int i = 0; i < 26; i++) {
            if (!has[i]) {
                System.out.println((char) ('a' + i));
                return;
            }
        }

        System.out.println("None");
    }
}