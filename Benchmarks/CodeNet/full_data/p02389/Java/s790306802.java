import java.util.Scanner;
import static java.lang.System.out;

class Rectangle {
    private int area;
    private int perimeter;

    Rectangle(int height, int width) {
        this.area = height * width;
        this.perimeter = (height * 2) + (width * 2);
    }

    @Override
    public String toString() {
        return String.format("%d %d", this.area, this.perimeter);
    }
}

public class Main {
    public static void main( String... args) {
        Scanner scan = new Scanner( System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        out.println(new Rectangle(a, b));
    }
}