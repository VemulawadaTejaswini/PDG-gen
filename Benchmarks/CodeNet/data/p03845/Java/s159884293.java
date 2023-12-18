import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T[] = new int[N];
        for (int i = 0; i < N; i++) {
            T[i] = sc.nextInt();
        }
        int M = sc.nextInt();
        int P[] = new int[M];
        int X[] = new int[M];
        for (int j = 0; j < M; j++) {
            P[j] = sc.nextInt();
            X[j] = sc.nextInt();
        }

        for (int j = 0; j < M; j++) {
            int tmp = T[P[j] - 1];
            T[P[j] - 1] = X[j];
            System.out.println(timeSumUp(T));
            T[P[j] - 1] = tmp;
        }

    }

    public static int timeSumUp(int A[]) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        return sum;
    }
}