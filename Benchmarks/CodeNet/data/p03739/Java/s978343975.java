import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long sum = sc.nextLong();
        long ans = 0;
        for (int i = 0; i < N - 1; i++) {
            long cur = sc.nextLong();
            if (Math.signum(sum) == Math.signum(sum + cur) || Math.signum(sum + cur) == 0) {
                long tmp = -(long) Math.signum(sum);
                ans += Math.abs(tmp - sum - cur);
                sum = tmp;
            } else {
                sum += cur;
            }
        }
        System.out.println(ans);
    }
}