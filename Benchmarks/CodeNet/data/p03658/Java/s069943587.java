import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        final int K = sc.nextInt();

        final Integer[] L = new Integer[N];
        for (int i = 0; i < N; i++) L[i] = sc.nextInt();

        Arrays.sort(L, Comparator.reverseOrder());

        int len = 0;
        for (int i = 0; i < K; i++) len += L[i];

        System.out.println(len);
    }
}
