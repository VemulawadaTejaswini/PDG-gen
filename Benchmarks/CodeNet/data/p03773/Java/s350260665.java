import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    private Scanner scanner = new Scanner(new BufferedInputStream(System.in));
    private PrintWriter stdout = new PrintWriter(new BufferedOutputStream(System.out));

    private void main() {
        int currentHours = scanner.nextInt();
        int contestBeginFor = scanner.nextInt();

        stdout.println((currentHours + contestBeginFor) % 24);
    }

    public static void main(String[] args) {
        Main clazz = new Main();
        clazz.main();
    }

}
