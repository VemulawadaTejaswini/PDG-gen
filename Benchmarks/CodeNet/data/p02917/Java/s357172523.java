import java.util.Scanner;

public class Main {
    public static int maximalValue(int[] A, int[] B) {
        A[0] = B[0];
        A[1] = B[0];
        for (int i = 1; i < B.length; i++) {
            if (B[i] > B[i-1]) {
                A[i+1] = B[i];
            } else {
                A[i+1] = B[i];
                A[i] = B[i];
            }
        }
        int res = 0;
        for (Integer i : A) res += i;
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
