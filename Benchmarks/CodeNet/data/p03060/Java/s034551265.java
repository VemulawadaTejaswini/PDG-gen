import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = nextInt(sc);

        int V[] = getIntArray(sc, N);
        int C[] = getIntArray(sc, N);

        show(calc(V, C, N));
    }

    private static int calc(int[] V, int[] C, int N) {
        int answer = 0;

        for (int i = 0; i < N; i++) {
            int diff = V[i] - C[i];
            if (diff > 0) answer += diff;
        }

        return answer;
    }

    private static void show(int answer) {
        System.out.println(answer);
    }

    private static int[] getIntArray(Scanner sc, int range) {
        int A[] = new int[range];
        for (int i = 0; i < range; i++) {
            A[i] = nextInt(sc);
        }
        return A;
    }

    private static int nextInt(Scanner sc) {
        return Integer.parseInt(sc.next());
    }
}