import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] data = new int[length];
        for (int i = 0; i < length; i++) {
            data[i] = scan.nextInt();
        }

        long total = 0;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                total += data[i] ^ data[j];
            }
        }
        long m = (long) Math.pow(10, 9) + 7;
        if (total < m) {
            System.out.println(total);
        } else {
            System.out.println(total % m);
        }

    }
}
