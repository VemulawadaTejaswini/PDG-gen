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
            int h = scanner.nextInt();
            int w = scanner.nextInt();
    
            if (h == 0 && w == 0) {
                scanner.close();
                return;
            }

            for (int y = 0; y < h; y++) {
                for (int x = 0; x < w; x++) {
                    if (y == 0 || y == h - 1 || x == 0 || x == w - 1) {
                        System.out.print("#");
                    } else {
                        System.out.print(".");
                    }
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}

