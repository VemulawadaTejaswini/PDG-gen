import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(scanner.next());
        }
        scanner.close();

        int count = 0;
        while (isEven(A)) {
            for (int i = 0; i < N; i++) {
                A[i] = A[i] / 2;
            }

            count++;
        }
        System.out.println(count);
    }

    private static boolean isEven(int[] a) {
        boolean isEven = true;
        for (int n : a) {
            if (n == 0 || n % 2 != 0) {
                isEven = false;
                break;
            }
        }
        return isEven;
    }
}
