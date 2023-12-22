import java.io.PrintWriter;
import java.util.*;

public class Main {


    static Scanner sc;
    static PrintWriter out;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        out = new PrintWriter(System.out);
        new Main().solve();
        out.flush();
    }

    public void solve() {
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for(int i=0; i<n; i++) {
            x[i] = Integer.parseInt(sc.next());
            y[i] = Integer.parseInt(sc.next());
        }
        int a = far(x, y, n, 0);
        int b = far(x, y, n, a);

        int res = Math.abs(x[a]-x[b]) + Math.abs(y[a]-y[b]);
        out.println(res);


    }

    int far(int[] x, int[] y, int n, int s) {
        int max = -1 ;
        int maxi = -1;

        for(int i=0; i<n; i++) {
            if(Math.abs(x[i]-x[s]) + Math.abs(y[i]-y[s]) > max) {
                maxi = i;
                max = Math.abs(x[i]-x[s]) + Math.abs(y[i]-y[s]);
            }
        }
        return maxi;
    }


}