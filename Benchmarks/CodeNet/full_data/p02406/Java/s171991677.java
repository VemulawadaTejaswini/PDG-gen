import java.io.IOException;
import java.util.Scanner;
public class Main {
    final private static int inputNumMin =     3;
    final private static int inputNumMax = 10000;

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int inputInt  = scan.nextInt();
        if(!isFormatNum(inputInt)) {
            throw new IOException();
        }
        call(inputInt);
    }
    private static void call(int inputInt) throws IOException {
        final String space = " ";
        for(int i = inputNumMin; i <= inputInt; i++) {
            if (i % 3 == 0 || i % 10 == 3) {
                System.out.print(space + i);
            }
        }
        System.out.println();
    }
    private static boolean isFormatNum(int inputInt) {
        return (inputNumMin <= inputInt && inputInt <= inputNumMax);
    }
}