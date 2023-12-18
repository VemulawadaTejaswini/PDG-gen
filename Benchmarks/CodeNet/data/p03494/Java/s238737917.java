import java.util.Scanner;

public class Main {
    private static Scanner sc;

    public Main() {
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        new Main().solve();

    }

    private void solve() {
        int N = sc.nextInt();
        int cnt = 0;
        boolean finished = false;
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        while (true) {
            for (int i = 0; i < N; i++) {
                if (nums[i] % 2 != 0) {
                    finished = true;
                }
                nums[i] /= 2;
            }
            if (finished) {
                break;
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}
