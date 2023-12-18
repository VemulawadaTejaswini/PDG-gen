import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        double sum = 0.0;
        for (int i = 1; i <= N; i++) {
            if (i >= K) {
                sum += 1.0 / N;
                continue;
            }
            int score = i;
            int ntos = 0;
            double p = 1.0 / N;
            while (score < K) {
                score *= 2;
                ntos++;
                p /= 2;
            }
            sum += p;
        }

        System.out.println(sum);

        return;
    }

}