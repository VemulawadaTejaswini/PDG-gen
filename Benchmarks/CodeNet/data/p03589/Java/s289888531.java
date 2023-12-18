
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = (long) scanner.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= 3500; i++) set.add(i);

        for (long j = 1; j <= 3500; j++) {
            for (long k = 1; k <= 3500;k++) {
                long x = (j * k * N);
                long y = 4 * j * k - N * (j + k);
                if (y != 0 && set.contains((int)(x / y))) {
                    System.out.print(k + " " + j + " " + x / y);
                    return;
                }
            }
        }
    }

}


