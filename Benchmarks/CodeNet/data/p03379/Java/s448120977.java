import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = in.nextInt();
            y[i] = x[i];
        }

        Arrays.sort(y);
        int medLeft = y[n / 2 - 1];
        int medRight = y[n / 2];
        
        for (int i = 0; i < n; i++) {
            if (x[i] <= medLeft) {
                System.out.println(medRight);
            } else {
                System.out.println(medLeft);
            }
        }
    }
}