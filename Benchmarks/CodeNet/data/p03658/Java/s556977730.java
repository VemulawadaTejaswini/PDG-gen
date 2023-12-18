import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        int K = cin.nextInt();
        Integer[] L = new Integer[N];
        for (int i = 0; i < N; i++) {
            L[i] = cin.nextInt();
        }

        Arrays.sort(L, Collections.reverseOrder());

        int sum = 0;
        for (int i = 0; i < K; i++) {
            sum += L[i];
        }
        System.out.println(sum);
    }
}