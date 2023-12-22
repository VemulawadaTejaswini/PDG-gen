import java.util.*;
public class Main {

    public static void main(String[] args){
        Main main = new Main();
        main.input();
        main.solve();
        main.output();
    }

    int N; // 1<=N<=1000000
    long result;

    private void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
    }

    private void solve() {
        if (N == 1) {
            result = 0;
            return;
        }
        Calc c = new Calc();
        c.n = 2;
        c.num_all = 100;
        c.num_outof0 = 81;
        c.num_outof0and9 = 64;
        c.num_include0 = 19;
        c.num_include0and9 = 2;
        while (true) {
            if (c.n == N) { break; }
            c = c.next();
            // System.out.println(c.num_include0and9);
        }
        result = c.num_include0and9 % 1000000007;
    }

    private void output() {
        System.out.println(result);
    }
}

class Calc {
    int n;
    long num_all;
    long num_outof0;
    long num_outof0and9;
    long num_include0;
    long num_include0and9;

    public Calc next() {
        Calc c = new Calc();
        c.n = this.n+1;
        c.num_all = this.num_all*10 % 1000000007;
        c.num_outof0 = this.num_outof0*9 % 1000000007;
        c.num_outof0and9 = this.num_outof0and9*8 % 1000000007;
        c.num_include0 = (this.num_include0*10 + this.num_outof0) % 1000000007;
        c.num_include0and9 = (c.num_outof0and9 + c.num_include0*2 - c.num_all) % 1000000007;
        if (c.num_include0and9 < 0) {
            c.num_include0and9 += 1000000007;
        }
        return c;
    }
}