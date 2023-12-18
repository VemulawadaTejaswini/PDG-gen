import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        solve(N);
    }

    static void solve(long N){
        double ans;
        double N2 = (double)N;
        if(N2%2==0){
            ans = 0.5;
        } else {
            ans = ((N2+1)/2) * 1.0 / N2;
        }
        System.out.println(ans);

    }
}
