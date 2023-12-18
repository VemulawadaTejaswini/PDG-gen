import java.util.Scanner;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        long min = Long.MAX_VALUE;
        int count = 0;
        for (int i = 0; i < n; i++) {
            long a = sc.nextLong();
            sum += Math.abs(a);
            min = Math.min(min, Math.abs(a));
            if (a < 0) {
                count++;
            }
        }
        if (count % 2 == 0) {
            System.out.println(sum);
        } else {
            System.out.println(sum - 2 * min);
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
