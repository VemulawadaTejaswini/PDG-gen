
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = scanner.nextLong();


        PrintStream printf;
        printf = System.out.printf("%f %f\n", (r*r*3.14159265),(r*2*3.14159265));
    }
}

