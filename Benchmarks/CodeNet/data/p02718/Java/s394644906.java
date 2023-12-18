import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] item = new int[N];
        for (int i = 0; i < N; i++) {
            item[i] = sc.nextInt();
        }

        int sum = 0;
        int wakeru = 1 / (4 * M);
        int count = 0;

        for (int j : item) {
            sum += j;
        }

        for (int a = 0; a < N; a++) {
            if ((sum / wakeru) > item[a]) {
                count += 1;
            }
        }
        if (count == M) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}