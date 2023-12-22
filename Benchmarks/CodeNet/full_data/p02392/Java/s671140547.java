import java.util.Scanner;
import static java.lang.System.out;

class Range {
    private boolean isDesk; // ?????????????????????????????????

    Range(int a, int b, int c) {
        this.isDesk =  ( a < b) ? ( ( b < c) ? true : false) : false;
    }

    @Override
    public String toString() {
        return isDesk ? "Yes" : "No";
    }
}

public class Main {
    public static void main( String... args) {
        Scanner scan = new Scanner( System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        out.println(new Range(a, b, c));
    }
}