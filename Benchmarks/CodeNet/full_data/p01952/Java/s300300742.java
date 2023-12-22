
import java.io.*;
import java.util.*;

/**
 * AIZU ONLINE JUDGE
 * 2852 Tiny Room
 *    2018/02/19
 */
public class Main {


    boolean main() throws IOException {

        Scanner sc = new Scanner(systemin);

        int N = sc.nextInt();
        int H = sc.nextInt();
        int W = sc.nextInt();
        int R = sc.nextInt();
        //log.printf("%d %d\n",  N, M);
        int[] x = new int[N];
        int[] y = new int[N];
        for(int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            log.printf("%d %d\n", x[i], y[i]);
        }
        
        int ret = 0;
        for(int i = 0; i < 100000; i++) {
            double s = i / 100000. * Math.PI;
            double xmax = -999999;
            double ymax = -999999;
            double xmin = 999999;
            double ymin = 999999;
            for(int n = 0; n < N; n++) {
                double x0 = Math.cos(s) * x[n] - Math.sin(s) * y[n];
                double y0 = Math.sin(s) * x[n] + Math.cos(s) * y[n];
                if (x0 > xmax)
                    xmax = x0;
                if (x0 < xmin)
                    xmin = x0;
                if (y0 > ymax)
                    ymax = y0;
                if (y0 < ymin)
                    ymin = y0;
            }
            int f = 0;
            if (xmax - xmin < W - R * 2 && ymax - ymin < H - R * 2) {
                f = 1;
                ret = 1;
            }
            log.printf("i%d x%f(%f %f) y%f(%f %f) %s\n", i,xmax-xmin, xmin,xmax, ymax-ymin,ymin, ymax, f != 0?"OK":"");
        }
        
        result.printf("%s\n", ret != 0? "Yes":"No");

        sc.close();
        return false;
    }

    PrintStream log;
    PrintStream result = System.out;
    BufferedReader systemin;

    static Main instance = new Main();

    Main() {
        systemin = new BufferedReader(new InputStreamReader(System.in));
        log = new PrintStream(new OutputStream() { public void write(int b) {} } );
    }

    public static void main(String[] args) throws IOException {

        instance.main();

        instance.systemin.close();
    }


}


