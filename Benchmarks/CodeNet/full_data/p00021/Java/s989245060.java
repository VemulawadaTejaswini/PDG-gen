import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
 
public class Main {
 
    int INF = 1 << 28;
 
    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++) {
            double[] x, y;
            x = new double[4];
            y = new double[4];
            for(int j=0;j<4;j++) { x[j] = sc.nextDouble(); y[j] = sc.nextDouble(); }
            boolean f = ( x[0] - x[1] ) * ( y[2] - y[3] ) - ( x[2] - x[3] ) * ( y[0] - y[1] ) == 0.0;
            System.out.println( (f? "YES": "NO") );
        }
    }
 
    public static void main(String[] args) {
        new Main().run();
    }
 
    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }
}
