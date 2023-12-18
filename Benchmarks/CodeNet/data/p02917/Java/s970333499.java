
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] bArr = new int[n - 1];

        for (int i = 0 ; i < n - 1; i++) {
            bArr[i] = sc.nextInt();
        }

        int sum = 0;
        sum += bArr[0];
        for (int i = 1; i< n - 1; i++) {
            sum += Math.min(bArr[i - 1], bArr[i]);
        }
        sum += bArr[n - 2];

        System.out.println(sum);
    }


    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
