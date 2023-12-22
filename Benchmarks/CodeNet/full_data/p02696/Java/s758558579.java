import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter(System.out);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long n = scanner.nextLong();
        double number = 0;
        for (int x = 1; x < n + 1; x++){
            double i = Math.floor((double) (a * x) / b) - a * Math.floor((double) x / b);
            if (i > number) {
                number = i;
            }
        }
        printWriter.println((int) number);
        printWriter.flush();
    }
}
