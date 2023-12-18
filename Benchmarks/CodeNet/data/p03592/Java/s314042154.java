import java.util.Scanner;

class Solver {

    private final int N;
    private final int M;
    private final int K;

    Solver(Scanner in){
        N = in.nextInt();
        M = in.nextInt();
        K = in.nextInt();
    }

    void solve() {
        for(int i = 0; i <= N; i++){
            for(int j = 0; j <= M; j++){
                if(i * M + j * N - 2 * i * j == K){
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        new Solver(in).solve();

        in.close();
    }
}