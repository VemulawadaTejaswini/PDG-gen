import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long max = 0;
        long sum = 0;
        int n = nextInt(scanner);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt(scanner);
        }
        max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] < max) {
                sum += max - a[i];
            }else if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(sum);
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







