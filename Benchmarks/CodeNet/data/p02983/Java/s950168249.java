import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {

        try (Scanner scanner = new Scanner(System.in)){
            long[] in = Arrays.stream(scanner.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
            long l = in[0];
            long r = in[1];
            long mod = 2019;

            long min = Integer.MAX_VALUE;
            for (long i = l; i < r; i++) {
                for (long j = i; j < r; j++){
                    if (i == j) continue;
                    long m = (i * j) % mod;

                    if (m < min) min = m;
                    if (min == 0) break;
                }
            }

            System.out.println(min);
        }

    }
}
