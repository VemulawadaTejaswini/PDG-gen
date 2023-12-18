import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        long S = sc.nextLong();
        long[] X = new long[3];
        long[] Y = new long[3];
        X[0] = 0;
        Y[0] = 0;
        X[1] = 1000000000;
        Y[1] = 1;
        Y[2] = S / X[1];
        X[2] = S % X[1];
        for(int i= 0;i<3;i++)
        System.out.print(X[i]+" "+Y[i]+" ");
        System.out.println();
    }
}