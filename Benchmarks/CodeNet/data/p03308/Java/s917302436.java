import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = cin.nextInt();
        }

        int min = A[0];
        int max = A[0];
        for (int i = 1; i < N; i++) {
            min = Math.min(min, A[i]);
            max = Math.max(max, A[i]);
        }
        System.out.println(max - min);
    }
}
