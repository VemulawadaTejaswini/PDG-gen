import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] Xz = new int[N];
        for (int i = 0; i < N; i++) {
            Xz[i] = sc.nextInt();
        }
        int sum = 0;
        int minSum = 1000000000;
        for (int i = 1; i < 100; i++) {
            sum = 0;
            for (int j = 0; j < N; j++) {
                sum += Math.pow((Xz[j] - i), 2);
            }
            if (sum < minSum) {
                minSum = sum;
            }
        }
        System.out.println(minSum);
    }
}

