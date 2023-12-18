import java.util.*;

public class Main {

    public static String numberN(int K, int[] A) {
        int min = 0;
        int max = 0;
        for (int i = 2; i < 10000; i++) {
            int remain = i;
            for (int j = 0; j < K; j++) {
                remain -= remain % A[j];
            }
            if (remain == 2) {
                if (min == 0) {
                    min = i;
                }
                max = i;
            }
        }
        if (min != 0 && max != 0) {
            return min + " " + max;
        } else {
            return "-1";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int[] A = new int[K];
        for (int i = 0; i < K; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println(numberN(K, A));
    }

}
