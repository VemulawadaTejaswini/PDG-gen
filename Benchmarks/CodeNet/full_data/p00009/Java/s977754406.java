import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            final int n = scanner.nextInt();

            System.out.println(PrimeNumbers.countPrimeNumber(n));
        }
    }

    public static class PrimeNumbers {

        public static int countPrimeNumber(int endValue) {
            if (endValue <= maxCheckedValue) {
                int count = 0;
                final int size = list.size();
                for (; count < size; count++) {
                    if (list.get(count) > endValue) {
                        break;
                    }
                }
                return count;
            }

            for (int n = maxCheckedValue + 1; n <= endValue; n++) {
                if (isPrimeNumber(n)) {
                    list.add(n);
                }
            }
            maxCheckedValue = endValue;

            return list.size();
        }

        public static boolean isPrimeNumber(int value) {
            for (final int primeNumber : list) {
                if (value % primeNumber == 0) {
                    return false;
                }
            }

            return true;
        }

        private static List<Integer>    list = new ArrayList<Integer>();
        private static int              maxCheckedValue = 1;

    }

}