
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static int N;
    static int M;
    static int Q;
    static int[] a;
    static int[] b;
    static int[] c;
    static int[] d;
    static int[] A;
    static int ans;

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        N = scan.nextInt();
        M = scan.nextInt();
        Q = scan.nextInt();

        a = new int[Q];
        b = new int[Q];
        c = new int[Q];
        d = new int[Q];

        for (int i = 0; i < Q; i++) {
            a[i] = scan.nextInt()-1;
            b[i] = scan.nextInt()-1;
            c[i] = scan.nextInt();
            d[i] = scan.nextInt();
        }

        A = new int[N];
        ans = 0;
        calc(0);

        os.println(ans);
    }

    static void calc(int idx) {
        if(idx == N) {
            max();
            return;
        }
        int startValue = idx == 0 ? 1 : A[idx-1];
        for(int i = startValue; i <= M; i++) {
            A[idx] = i;
            calc(idx+1);
        }
    }

    static void max() {
        int temp = 0;
        for(int i = 0; i < Q; i++) {
            if(A[b[i]]-A[a[i]] == c[i]) {
                temp += d[i];
            }
        }
        ans = Math.max(ans, temp);
    }

}