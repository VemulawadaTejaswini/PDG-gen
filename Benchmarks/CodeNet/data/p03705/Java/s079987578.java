import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    private long combi(long n, long r, long mod) {
        long ret = 1;
        for(int i = 1; i <= r; i++){
            ret = ret * (n - i + 1) / i;
            ret %= mod;
        }   
        return ret;
    }   


    public void run() {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();

        long np = B - A + 1;
        if (N == 1) {
            if (A != B) System.out.println(0);
            else System.out.println(np);
            return;
        }

        //System.out.println(String.format("%d %d", np, N - 2));
        // np H N - 2 = (np + N - 2 + 1) C (N - 2)
        //System.out.println(String.format("%d C %d", N - 2 + np - 1, N - 2));
        long ans = combi(N - 2 + np - 1, N - 2, 998244353);

        System.out.println(ans);


        return;
    }

}