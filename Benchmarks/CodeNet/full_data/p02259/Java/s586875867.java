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

        boolean flag = true;
        int cnt = 0;
        int i = 0;
        while (flag) {
            flag = false;
            for (int j = N - 1; j >= i + 1; j--) {
                if (A[j] < A[j - 1]) {
                    int tmp = A[j - 1];
                    A[j - 1] = A[j];
                    A[j] = tmp;
                    flag = true;
                    cnt++;
                }
            }
            i++;
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