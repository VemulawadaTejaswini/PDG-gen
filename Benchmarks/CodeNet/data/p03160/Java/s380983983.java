import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long[] h = new long[(int)(N)];
        for(int i = 0 ; i < N ; i++){
                h[i] = sc.nextLong();
        }
        solve(N, h);
    }

    static void solve(long N, long[] h){

    }
}
