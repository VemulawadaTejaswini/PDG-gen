
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        new Main().run();
    }

    int N;
    long W;
    long[] w;
    long[] v;

    private void run() {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        W = scanner.nextLong();
        w = new long[N];
        v = new long[N];
        for(int i = 0; i < N; i++) {
            w[i] = scanner.nextLong();
            v[i] = scanner.nextLong();
        }

        System.out.println(f(0, W));
    }

    private long f(int i, long weight) {

        if(i == N) {
            return 0;
        }else if(weight  < w[i]) {
            return f(i + 1, weight);
        }else{
            return Math.max(f(i + 1, weight), f(i + 1, weight - w[i]) + v[i]);
        }
    }
}