import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");
        long n = Integer.parseInt(array[0]);
        int m = Integer.parseInt(array[1]);
        int d = Integer.parseInt(array[2]);

        double p;
        if (d == 0) {
            p = n;
        } else {
            p = (n - d) * 2;
        }
        System.out.printf("%1.10f\n", (p * (m - 1)) / (n * n));
    }
}