import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        if (N == 1) {
            System.out.println("Yes");
            return;
        }
        int[] H = new int[N];
        for (int i = 0; i < N; i++) H[i] = sc.nextInt();
        boolean isExistReduce = false;

        for (int i = 1; i < N; i++) {
            if (H[i] < H[i - 1]) {
                if (isExistReduce || H[i - 1] - H[i] < -1) {
                    System.out.println("No");
                    return;
                }
                isExistReduce = true;
            }

        }
        System.out.println("Yes");
    }
}