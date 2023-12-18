import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter(System.out);
        long x = scanner.nextLong();
        int count = 0;
        for (long i = 100; i < x;){
            i *= 1.01;
            count++;
        }
        printWriter.println(count);
        printWriter.flush();
    }
}
