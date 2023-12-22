
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int loopCount = Integer.parseInt(scanner.next());
        int cheaper = 0;
        int maximum = 0;
        for (int i = 0; i < loopCount; i++) {
            int current = Integer.parseInt(scanner.next());
            int diff = current - cheaper;
            if (diff > maximum) {
                maximum = diff;
            }
            if (current < cheaper) {
                cheaper = current;
            }
        }

        System.out.println(maximum);
    }
}