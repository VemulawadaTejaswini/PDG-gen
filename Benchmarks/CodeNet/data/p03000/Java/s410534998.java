import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] L = new int[N+1];
        L[0] = 0;
        for(int i = 1; i < N+1; i++) {
            L[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(Bounding(N+1, X, L, 0, 0));
    }
    public static int Bounding(int N, int X, int[] L, int index, int sum) {
        if (N <= index) {
            return 0;
        }
        if (sum + L[index] <= X) {
            return 1 + Bounding(N, X, L, index + 1, sum + L[index]);
        }
        return 0;
    }
}
