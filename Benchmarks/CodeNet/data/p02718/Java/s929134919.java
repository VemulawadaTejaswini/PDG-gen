import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int count = 0;
        int all = 0;

        int[] A = new int[1000];
        for(int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
            all += A[i];
        }

        all = all / 4 / M;

        for(int i = 0; i < N; i++) {
            if(A[i] >= all) {
                count++;
            }
        }

        if(count >= M) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}