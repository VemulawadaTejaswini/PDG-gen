
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public final class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        for (int i = 1; i <= 5; i++) {
            int curr = in.nextInt();
            if (curr == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
