import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long s = scanner.nextInt();
        scanner.close();

        long index = 1;

        while (true) {
            if (s == 4) {
                break;
            }

            if (s % 2 == 0) {
                s = s / 2;
                index++;
            } else {
                s = 3 * s + 1;
                index++;
            }

        }

        System.out.println(index + 3);

    }
}
