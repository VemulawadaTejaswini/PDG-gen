import java.util.Scanner;
import java.util.function.BooleanSupplier;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        long length = scanner.nextLong();
        long blue = scanner.nextLong();
        long red = scanner.nextLong();

        long[] acc = {0};
        long[] blueCount = {0};
        long[] redCount = {0};

        pow(10, 100, () -> {
            long diff = length - acc[0];
            if (diff <= 0) {
                return true;
            }
            if (diff >= blue) {
                blueCount[0] += blue;
                acc[0] += blue;
                diff -= blue;
            } else {
                blueCount[0] += diff;
                acc[0] += diff;
                return true;
            }

            if (diff >= red) {
                redCount[0] += red;
                acc[0] += red;
//                diff -
            } else {
                redCount[0] += diff;
                acc[0] += diff;
            }
            return false;
        });

        System.out.println(blueCount[0]);
    }

    static void pow(int base, int p, BooleanSupplier runnable) {

        for (int i = 0; i < p; i++) {
            for (int j = 0; j < base; j++) {
                for (int k = 0; k < base; k++) {
                    boolean result = runnable.getAsBoolean();
                    if (result) {
                        return;
                    }
                }
            }
        }
    }
}