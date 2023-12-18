import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = Integer.parseInt(scanner.next());
            int[] p = IntStream.range(0, n).map(i -> Integer.parseInt(scanner.next())).toArray();
            int r = 0;
            for (int i = 0; i < p.length; i++) {
                boolean b = true;
                for (int j = 0; j < i; j++) {
                    if (p[j] < p[i]) {
                        b = false;
                        break;
                    }
                }
                if (b)
                    r++;
            }
            System.out.println(r);
        }
    }

}
