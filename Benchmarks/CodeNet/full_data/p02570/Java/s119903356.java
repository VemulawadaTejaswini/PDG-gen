import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Harry on 5/10/20.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int d = scanner.nextInt();
        int t = scanner.nextInt();
        int s = scanner.nextInt();
        double need = (double)d/s;
        System.out.println(need<=t ? "Yes" : "No");
    }
}
