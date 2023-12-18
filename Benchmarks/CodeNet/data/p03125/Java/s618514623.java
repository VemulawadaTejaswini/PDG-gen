import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        q_3();
    }

    private static void q_3() {
        try (Scanner scan = new Scanner(System.in)) {
            int n = Integer.parseInt(scan.next());
            int[] l = IntStream.range(0, n).map(i -> Integer.parseInt(scan.next())).toArray();
            int min = Arrays.stream(l).min().getAsInt();
            int remnant = (Arrays.stream(l).sum() - min) % min;

            System.out.println(remnant <= 0 ? min : remnant);
        }
    }
}