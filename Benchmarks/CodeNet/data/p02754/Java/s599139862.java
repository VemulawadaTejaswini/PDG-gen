import java.math.BigDecimal;
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
            acc[0] += Math.min(diff, red);
            return false;
        });

        System.out.println(blueCount[0]);
    }

    static void pow(int base, int p, BooleanSupplier runnable) {

        BigDecimal max = BigDecimal.valueOf(base).pow(p);
        for (BigDecimal i = BigDecimal.valueOf(0); i.compareTo(max) < 0; ) {
            boolean result = runnable.getAsBoolean();
            if (result) {
                return;
            }
            i = i.add(BigDecimal.ZERO);
        }
//        for (int i = 0; i < p; i++) {
//            for (int j = 0; j < base; j++) {
//                for (int k = 0; k < base; k++) {
//                    boolean result = runnable.getAsBoolean();
//                    if (result) {
//                        return;
//                    }
//                }
//            }
//        }
    }
}