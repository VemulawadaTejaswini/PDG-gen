import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IntStream NStream = IntStream.range(1, sc.nextInt() + 1);
        System.out.println(NStream.filter(Main::isDigitOdd).count());

    }

    static boolean isDigitOdd(int n) {
        return ((int) Math.log10((double) n) + 1) % 2 != 0;
    }
}