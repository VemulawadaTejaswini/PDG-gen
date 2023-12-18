import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] a = new long[N];
        boolean ans = true;
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextLong();
            if (i >= 2 && i < N && ans) {
                ans = a[i - 1] == (a[i - 2] ^ a[i]);
            }
        }
        if ((a[0] == (a[1] ^ a[N - 1])) && (a[N - 1] == (a[N - 2] ^ a[0]))) {
        } else {
            ans = false;
        }
        if(ans){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }