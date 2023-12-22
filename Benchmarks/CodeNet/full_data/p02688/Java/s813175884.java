import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        boolean[] na = new boolean[N + 1];
        for (int i = 0; i < K; i++) {
            int d = sc.nextInt();
            for (int j = 0; j < d; j++) {
                na[sc.nextInt()] = true;
            }
        }
        int count = 0;
        for (int i = 1; i <= N; i++) {
            count += !na[i] ? 1 : 0;
        }
        System.out.println(count);
    }
}