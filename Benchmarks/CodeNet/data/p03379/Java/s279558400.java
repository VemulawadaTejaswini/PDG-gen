import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] X = new long[N];
        long[] sortedX = new long[N];

        for (int i = 0; i < N; i++) {
            X[i] = sc.nextInt();
            sortedX[i] = X[i];
        }

        Arrays.sort(sortedX);
        long medianSmaller = sortedX[N / 2];
        long medianBigger = sortedX[N / 2 - 1];

        for (int i = 0; i < N; i++) {
            if (medianSmaller > X[i]) {
                out.println(medianSmaller);
            } else {
                out.println(medianBigger);
            }
        }
    }
}