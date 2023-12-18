import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0;
        boolean end = false;

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        while (!end) {
            end = true;
            for (int i = 0; i < n; i++) {
                if ((a[i] % 2 == 0)&&(end)) {
                    a[i] /= 2;
                    end = false;
                } else {
                    a[i] *= 3;
                }
            }

            if (!end) {
                result += 1;
            }
        }

        System.out.println(result);


    }
}
