import java.util.Scanner;
import static java.lang.System.out;

class Watch {
    public void run() {
        int input = new Scanner( System.in ).nextInt();
        int h = input / 3600;
        int m = input % 3600 / 60;
        int s = input % 60 % 60;

        out.printf( "%d:%d:%d\n", h, m, s);
    }
}

public class Main {
    public static void main( String... args) {
        Watch test = new Watch();
        test.run();
    }
}