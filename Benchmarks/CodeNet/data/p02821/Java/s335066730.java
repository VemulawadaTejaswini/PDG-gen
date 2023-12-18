import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int m = std.nextInt();
        Integer[] as = new Integer[n];
        for (int i = 0; i < n; i++) {
            int a = std.nextInt();
            as[i] = a;
        }

        Arrays.sort(as, Collections.reverseOrder());
        
        int mCount = m / 4;
        long ans = 0;
        int maxIndex = 0;
        for (int i = 0; i < mCount; i++) {
            ans += (as[maxIndex] + as[maxIndex + 1]) * 4;
            maxIndex++;
        }
        int restCount = m % 4;
        if (restCount >= 1) {
            int d = as[maxIndex] * 2;
            ans += d;
        }
        if (restCount >= 2) {
            ans += as[maxIndex] + as[maxIndex + 1];
        }
        if (restCount >= 3) {
            ans += as[maxIndex] + as[maxIndex + 1];
        }

        System.out.println(ans);
    }
}
