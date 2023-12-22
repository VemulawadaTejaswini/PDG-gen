package atcoder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();

        double b = scanner.nextDouble();
        b *= 100;

        long result = a*(long)b/100;

        System.out.print((result);

    }
}