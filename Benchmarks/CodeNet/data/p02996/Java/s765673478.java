import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
 
    int n;
    P[] ps;
 
 
    void run() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ps = new P[n];
 
        long t = 0;
        for (int i = 0; i < n; i++) {
            ps[i] = new P(sc.nextLong(), sc.nextLong());
            t += ps[i].a;
        }
 
        Arrays.sort(ps);
        for (int i = 0; i < n; i++) {
            if (t > ps[i].b) t = ps[i].b;
            if (t - ps[i].a < 0) {
                System.out.println("No");
                return;
            }
            t -= ps[i].a;
        }
 
        System.out.println("Yes");
    }
 
    class P implements Comparable<P> {
        long a, b;
        P(long a, long b) {
            this.a = a;
            this.b = b;
        }
 
        @Override
        public int compareTo(P o) {
            return (o.b - b > 0) ? 1 : -1;
        }
    }
 
 
    void debug(Object...os) {
        System.err.println(Arrays.deepToString(os));
    }
 
    public static void main(String[] args) {
        new Main().run();
    }
}