
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        for (long i = 1; i < 3500; i++) {
            for (long j = 1; j < 3500; j++) {
                long lb = 0, ub = 3501;
                while (ub - lb > 1) {
                    long mid = (lb + ub) / 2;
                    if (N * (i * j + j * mid + mid * i) / (i * j * mid) == 4 && N * (i * j + j * mid + mid * i) % (i * j * mid) == 0) {
                        System.out.println(i + " " + j + " " + mid);
                        return;
                    }
                    if (N * (i * j + j * mid + mid * i) / (i * j * mid) < 4) {
                        ub = mid;
                    } else {
                        lb = mid;
                    }
                }
            }
        }
    }
}
