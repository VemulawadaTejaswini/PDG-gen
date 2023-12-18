import java.util.*;
public class Main {
    static Neta[] susi;
    static long max = 0;
    static void comb2(int n1, int n2) {
        int[] m = new int[100001];
        int nest = 0, col = 1;
        nest0(nest, col, n1, n2, m);
    }
    static void nest0(int nest, int col, int n1, int n2, int[] m) {
        for (int i = nest + 1 ; i <= n2 + col; i++) {
            m[col] = i;
            if (n1 != col) {
                nest0(i, col + 1, n1, n2, m);
            } else {
                long sum = 0;
                Set<Integer> s = new HashSet<Integer>();
                for (int k = 1; k <= n1; k++) {
                    int a = m[k];
                    s.add(susi[a - 1].t);
                    sum += susi[a - 1].d;
                }
                long mm = s.size() * s.size();
                mm += sum;
                max = Math.max(max, mm);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), K = sc.nextInt();
        susi = new Neta[N];
        for (int n = 0; n < N; n++) {
            susi[n] = new Neta(sc.nextInt(), sc.nextInt());
        }
        //susi.sort(function(a,b) { return b.d - a.d; });
    
        comb2(K, N-K);
        System.out.println(max);
        sc.close();
    }
}
class Neta {
    int t, d;
    Neta() {
        this.t = this.d = 0;
    }
    Neta(int t, int d) {
        this.t = t;
        this.d = d;
    }
}
