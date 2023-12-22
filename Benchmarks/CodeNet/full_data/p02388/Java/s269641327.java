import static java.lang.System.out;
import java.util.Scanner;

class XCubic {
    public void run() {
        int input = new Scanner( System.in).nextInt();
        out.println( power( input, 3));
    }

    private int power( int num, int index) {
        if ( index < 2) {
            return num;
        }
        return num * power( num, index -1);
    }
}

public class Main {
    public static void main( String... args) {
        XCubic test = new XCubic();
        test.run();
    }
}