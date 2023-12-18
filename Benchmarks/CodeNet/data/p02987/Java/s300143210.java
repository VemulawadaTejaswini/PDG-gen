import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(System.in);

        String line = s.nextLine();

        char[] chars = line.toCharArray();

        Arrays.sort(chars);

        if (chars[0] == chars[1] && chars[0] != chars[2] && chars[2] == chars[3]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
