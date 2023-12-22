import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int m = scanner.nextInt(), f = scanner.nextInt(), r = scanner.nextInt();

            if (m == -1 && f == -1 && r == -1) break;

            String score;
            if (m == -1 || f == -1 || m + f < 30) {
                score = "F";
            } else if (m + f < 50 && r < 50) {
                score = "D";
            } else if (m + f < 65 || (m + f < 50 && r >= 50)) {
                score = "C";
            } else if (m + f < 80) {
                score = "B";
            } else {
                score = "A";
            }

            System.out.println(score);
        }
    }
}
