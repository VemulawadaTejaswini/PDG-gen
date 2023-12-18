import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        int count = scanner.nextInt();

        int onesAll = 0;
        int twosAll = 0;
        int threesAll = 0;
        for (int i = 0; i < count; ++i) {
            int value = scanner.nextInt();
            switch (value) {
                case 1:
                    onesAll++;
                    break;
                case 2:
                    twosAll++;
                    break;
                case 3:
                    threesAll++;
                    break;
            }
        }

        double[][][] s = new double[count + 1][count + 1][count + 1];

        for (int threes = 0; threes <= count; ++threes) {
            for (int twos = 0; twos <= count - threes; ++twos) {
                for (int ones = 0; ones <= count - twos - threes; ++ones) {
                    int countNonZero = ones + twos + threes;
                    double steps = countNonZero == 0 ? 0.0 : 1.0 * count / countNonZero;
                    if (ones > 0) {
                        steps += s[ones - 1][twos][threes] * ones / countNonZero;
                    }

                    if (twos > 0) {
                        steps += s[ones + 1][twos - 1][threes] * twos / countNonZero;
                    }

                    if (threes > 0) {
                        steps += s[ones][twos + 1][threes - 1] * threes / countNonZero;
                    }

                    s[ones][twos][threes] = steps;
                }
            }
        }

        System.out.println(s[onesAll][twosAll][threesAll]);
    }
}
