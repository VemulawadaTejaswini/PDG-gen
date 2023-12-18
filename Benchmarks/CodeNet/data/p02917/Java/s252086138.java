import java.util.Scanner;

public class Main {
    private static int maximalValue(int[] A, int[] B) {
        int res = B[0] * 2;
        for (int i = 1; i < B.length; i++) {
            if (B[i] > B[i - 1]) res += B[i];
            else res = res - B[i- 1] + B[i] * 2;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] B = new int[N-1];
        int[] A = new int[N];
        for (int i = 0; i < B.length; i++) B[i] = in.nextInt();

        System.out.println(maximalValue(A, B));
    }
}
