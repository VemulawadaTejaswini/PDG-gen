import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int all_point = 0;
        for (int i = 0; i < N; i++) {
            all_point += A[i];
        }
        int ans = 4 * M;
        int point = all_point / ans;
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] > point) {
                count += 1;
            }
        }
        if (M <= count || A[0] == 0) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}