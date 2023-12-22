import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int c = 0;
            while (sc.hasNext()) {
                int n = Integer.parseInt(sc.nextLine());
                if (isPrimeNumber(n)) {
                    ++c;
                }
            }
            System.out.println(c);
        } catch (NoSuchElementException | NumberFormatException e) {
            System.out.println(e);
        }
    }

    private static boolean isPrimeNumber(int n) {
        int compositeNumber = (int)Math.pow(n, 0.5);
        for (int i = 2; i <= compositeNumber; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static class IllegalTestCaseException extends RuntimeException {
        IllegalTestCaseException() {
            super("Illegal condition.");
        }
    }
}

