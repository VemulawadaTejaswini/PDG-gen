import java.util.Scanner;

public class Main {

    public Main() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int[] A = new int[N];
        int max = 0;
        for (int i = 0; i < N; i++) {
            int in = scanner.nextInt();
            A[i] = in;
            max = Math.max(in , max);
        }

        int left = 0, right = max+1;
        while(right - left > 1){
            int mid = left + ( right - left ) / 2;

            int sum = 0;
            for (int i = 0; i < N; i++) {
                sum += (A[i]+mid-1)/mid - 1;
            }

            if (sum <= K){
                right = mid;
            } else {
                left = mid;
            }
        }

        System.out.println(right);
    }

    public static void main(String[] args) {
        new Main();
    }
}
