import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    static final int MOD = 1000000007;
    static final int INF = 1 << 30;
    static final int ALF = 26;

    Main() {
        Scanner sc = new Scanner(System.in);
        long ans = 0;
        long A = sc.nextLong();
        long B = sc.nextLong();
        long N = sc.nextLong();
        double da = A;
        double db = B;
        if(B<N){
            
        ans = Math.max(
            Math.max(
                (long)Math.floor(da*(N-N%B-1)/db) - A * (long)Math.floor((N-N%B-1)/db),
                (long)Math.floor(da*N/db) - A * (long)Math.floor(N/db)
            ),
            Math.max(
                (long)Math.floor(da*(B-1)/db) - A * (long)Math.floor((B-1)/db),
                (long)Math.floor(da*N/db) - A * (long)Math.floor(N/db)
            )
        );
            /*
            if(A<B){
                ans = (long)Math.floor(da*(N-N%B-1)/db) - A * (long)Math.floor((N-N%B-1)/db);
            }else{
                ans = (long)Math.floor(da*(N-N%B-1)/db) - A * (long)Math.floor((N-N%B-1)/db);
            }*/
        }else{
            ans = (long)Math.floor(da*N/db) - A * (long)Math.floor(N/db);
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        new Main();
    }
}
