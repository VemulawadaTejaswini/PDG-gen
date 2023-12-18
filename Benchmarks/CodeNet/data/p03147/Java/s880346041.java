import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ans = 0;
        int N = in.nextInt();
        int[] values = new int[N];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            values[i] = in.nextInt();
            min = Math.min(values[i], min);
        }

        int[] valuesWithPadding = new int[N+2];
        for (int i = 0; i < N; i++) {
            valuesWithPadding[i+1] = values[i] - min;
        }
        ans += values[0];

        while (true) {
            int count = 0;
            for (int i = 1; i < N+1; i++) {
                if (valuesWithPadding[i] != 0) {
                    if (i - 1 > 0 && valuesWithPadding[i - 1] == 0) {
                        count++;
                    }
                }
            }
            if (count == 0) break;
            for (int i = 1; i < N+1; i++) {
                if (valuesWithPadding[i] != 0) {
                    valuesWithPadding[i] -= 1;
                }
            }
            ans += count;
        }
        System.out.println(ans);

    }

}
