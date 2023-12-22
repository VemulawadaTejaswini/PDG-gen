import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter(System.out);
        if (scanner.nextLine().equals("ABC")) {
            printWriter.println("ARC");
        }else {
            printWriter.println("ABC");
        }
        printWriter.flush();
    }
}
