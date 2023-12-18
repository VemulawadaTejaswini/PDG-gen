import java.util.Scanner;

class Solver {

    private final int K;

    Solver(Scanner in){
        int N = in.nextInt();
        K = in.nextInt();
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (in.nextInt() >= K) count++;
        }
        System.out.println(count);
    }

    void solve() {

    }
}

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        new Solver(in).solve();

        in.close();
    }
}