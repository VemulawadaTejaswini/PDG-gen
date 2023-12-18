import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }

        int[] x1  = x.clone();
        Arrays.sort(x1);
        int med1 = x1[n/2];
        int med2 = x1[n/2-1];

        for (int i = 0; i < n; i++) {
            if (x[i] < med1)
                System.out.println(med1);
            else
                System.out.println(med2);
        }
    }
}
