import java.util.Scanner;
import java.util.stream.Collectors;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (i * M + j * N - i * j == K) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}