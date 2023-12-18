import java.util.Scanner;
import java.util.Stack;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        int denom = (int) Math.pow(10, 9) + 7;
        int N = sc.nextInt();
        long ans = 1;
        for (int i = 1; i <= N; i++) {
            ans = ans * i % denom;
        }
        System.out.println(ans);
    }
}
