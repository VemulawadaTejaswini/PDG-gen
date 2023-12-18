import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt() - 1;
            }

            int[] inverse = new int[N];
            for (int i = 0; i < inverse.length; i++) {
                inverse[A[i]] = i;
            }

            for (int i = 0; i < inverse.length; i++) {
                if (i > 0) {
                    System.out.print(" ");
                }
                System.out.print(inverse[i] + 1);
            }
            System.out.println();
        }
    }
}
