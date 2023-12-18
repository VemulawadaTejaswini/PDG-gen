import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

class Main {
    void solve() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        HashSet<Long> set = new HashSet<>();
        ArrayList<S> list = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            long a = in.nextLong() - 1, b = in.nextLong() - 1;
            if(a > b) {
                long c = a;
                a = b;
                b = c;
            }
            list.add(new S(a, b));
            set.add(a * n + b);
        }
        boolean f = true;
        int ans = 0;
        while(f) {
            f = false;
            for(int i = 0; i < list.size() - 1; i++) {
                for(int j = i; j < list.size(); j++) {
                    S s1 = list.get(i), s2 = list.get(j);
                    
                    long[] a  = {s1.a, s1.a, s1.b, s1.b};
                    long[] b  = {s2.a, s2.b, s2.a, s2.b};
                    long[] a2 = {s1.b, s1.b, s1.a, s1.a};
                    long[] b2 = {s2.b, s2.a, s2.b, s2.a};
                    
                    for(int k = 0; k < 4; k++) {
                        long from = Math.min(a[k], b[k]);
                        long to = Math.max(a[k], b[k]);
                        
                        if(from == to) {
                            continue;
                        }
                        if(set.contains(new Long(from * n + to))) {
                            continue;
                        }
                        
                        long from2 = Math.min(a2[k], b2[k]);
                        long to2 = Math.max(a2[k], b2[k]);
                        if(from2 == to2) {
                            continue;
                        }
                        if(set.contains(new Long(from2 * n + to2))) {
                            f = true;
                            ans++;
                            set.add(from * n + to);
                            list.add(new S(from, to));
                        }   
                    }
                }
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        new Main().solve();
    }
}
class S{
    long a, b;
    public S(long a, long b) {
        this.a = a;
        this.b = b;
    }
}