import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < N - 1; i++) {
            int cur = sc.nextInt();
            if (Math.signum(sum) == Math.signum(sum + cur) || Math.signum(sum + cur) == 0) {
                int tmp = -(int) Math.signum(sum);
                ans += Math.abs(tmp - sum - cur);
                sum = tmp;
            } else {
                sum += cur;
            }
        }
        System.out.println(ans);
    }
}
