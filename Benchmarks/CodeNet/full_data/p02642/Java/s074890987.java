import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = nextInt(scanner);
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextDouble(scanner);
        }
        int count = 0;
        loop: for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    double div = a[i] / a[j];
                    if (div == Math.floor(div)) {
                        continue loop;
                    }
                }
            }
            count++;
        }
        System.out.println(count);
    }

    private static int nextInt(Scanner scanner) {
        return Integer.parseInt(scanner.next());
    }

    private static long nextLong(Scanner scanner) {
        return Long.parseLong(scanner.next());
    }

    private static float nextFloat(Scanner scanner) {
        return Float.parseFloat(scanner.next());
    }

    private static double nextDouble(Scanner scanner) {
        return Double.parseDouble(scanner.next());
    }


}



