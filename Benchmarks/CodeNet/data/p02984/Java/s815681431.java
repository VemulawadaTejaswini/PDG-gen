import java.io.PrintWriter;
import java.util.*;

public class Main {
    PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.solve());
    }
    long solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n+1];
        long ans = 0;
        for(int i=1;i<=n;i++) {
            a[i]=sc.nextLong();
            ans += a[i]*(i%2==1?1:-1);
        }
        // find y1
        long[] y = new long[n+1];
        y[1] = ans/2;
        for(int i=2;i<=n;i++){
            y[i] = a[i-1]-y[i-1];
        }
        for(int i=1;i<=n;i++) out.print(String.format("%d ",2*y[i]));
        out.flush();
        System.exit(0);
        return 0;
    }
}