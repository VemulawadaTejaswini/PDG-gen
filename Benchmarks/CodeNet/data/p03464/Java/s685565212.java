import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int A[] = new int[K];
        int ans = 2;
        boolean check = true;
        for (int i = 0; K > i; i++) {
            A[i] = sc.nextInt();
        }
        if (A[K - 1] == 2) {
            for (int j = K - 1; 0 < j; j--) {
                if (A[j] <= A[j - 1]) {
                    ans += (A[j - 1] - A[j]);
                } else if (A[j] < A[j - 1] * 2) {
                    ans = A[j - 1] * 2;
                } else {
                    ans = -1;
                    check = false;
                    break;
                }

            }
        } else {
            ans = -1;
            check = false;
        }
        if (check == true) {
            System.out.print(ans);
            System.out.print(" ");
            System.out.println(ans + A[0] - 1);
        } else {
            System.out.println(ans);

        }
    }

}
