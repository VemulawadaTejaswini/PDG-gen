import java.util.Scanner;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        new Main().solve();
    }

    private Scanner sc;

    private void solve() {
        sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            int minj = i;
            for (int j = i; j < N; j++) {
                if (A[j] < A[minj]) {
                    minj = j;
                }
            }
            if (minj != i) {
                int tmp = A[i];
                A[i] = A[minj];
                A[minj] = tmp;
                cnt++;
            }
        }
        String ans = "";
        for (int num : A) {
            ans += num;
            ans += " ";
        }

        System.out.println(ans.trim());
        System.out.println(cnt);
    }
}