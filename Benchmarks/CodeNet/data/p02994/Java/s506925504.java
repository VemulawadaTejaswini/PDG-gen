
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int n = in.nextInt();
        final int l = in.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += l + i;
        }
        if (l >= 0) {
            sum -= l;
            System.out.println(sum);
        } else {
            if (l + n - 1 >= 0) {
                System.out.println(sum);
            } else {
                sum -= l + n - 1;
                System.out.println(sum);
            }
        }
    }
}
