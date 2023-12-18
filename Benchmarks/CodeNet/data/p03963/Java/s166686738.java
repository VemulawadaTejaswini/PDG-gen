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

        long result = 1;
        for (int i = 0; i < N; i++) {
            if (i == 0) result *= K;
            else result *= (K - 1);
        }

        System.out.println(result);

        return;
    }

}