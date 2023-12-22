import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String line = scanner.nextLine();
            if (line.equals("0")) {
                scanner.close();
                return;
            }
            int x = 0;
            for (int i = 0; i < line.length(); i++) {
                x += Integer.parseInt("" + line.charAt(i));
            }
            System.out.println(x);
        }
    }
}

