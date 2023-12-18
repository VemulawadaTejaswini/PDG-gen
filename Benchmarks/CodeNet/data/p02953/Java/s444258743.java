import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] H = new int[N];

        for (int i = 0; i < N; i++) {
            H[i] = sc.nextInt();
        }

        if (N == 1) {
            System.out.println("Yes");
        } else if (N == 2) {
            if (H[0] <= H[1]) {
                System.out.println("Yes");
            } else if (H[0] - H[1] <= 1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            for (int i = 1; i < N - 1; i++) {
                if (H[i - 1] <= H[i]) {
                    //OK
                } else if (H[i - 1] - H[i] <= 1) {
                    H[i - 1]--;
                } else {
                    System.out.println("No");
                    return;
                }

                if (H[i] <= H[i + 1]) {
                    //OK
                } else if (H[i] - H[i + 1] <= 1) {
                    H[i]--;
                } else {
                    System.out.println("No");
                    return;
                }

                if (H[i - 1] >  H[i]) {
                    System.out.println("No");
                    return;
                }
            }
            System.out.println("Yes");
        }
    }
}