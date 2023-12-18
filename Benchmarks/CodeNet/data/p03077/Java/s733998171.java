import java.util.Arrays;
import java.util.Scanner;

class Solver{
    final long N;
    final long[] W;

    Solver(Scanner in){
        N = in.nextLong();
        W = new long[5];
        for(int i = 0; i < W.length; i++){
            W[i] = in.nextLong();
        }
    }

    void solve(){
        Arrays.sort(W);
        System.out.println((long) Math.ceil(N * 1. / W[0]) + 4);
    }
}

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        new Solver(in).solve();

        in.close();
    }
}