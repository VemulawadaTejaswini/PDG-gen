import java.io.PrintWriter;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    final long mod = 1000000000+7;
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
        out.flush();
//        System.out.println(main.solve());
    }
    // segment tree to record minimum value
    // Each point has a infinite distance from 0 (except itself)
    void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> set = new HashSet<>(n/2+1);
        for(int i=0;i<n;i++){
            set.add(sc.nextInt());
        }
        if(set.size()==n) out.println("YES");
        else out.println("NO");
    }
}

