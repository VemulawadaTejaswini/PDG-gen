import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        int M = stdIn.nextInt();

        int[] A = new int[N];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            A[i] = stdIn.nextInt();
            sum += A[i];
        }
        stdIn.close();

        int over = 0;
        for (int i = 0; i < N; i++) {
            if ((double)A[i] >= (double)sum / (4 * M)) {
                over++;
            }
        }

        if (over >= M) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}