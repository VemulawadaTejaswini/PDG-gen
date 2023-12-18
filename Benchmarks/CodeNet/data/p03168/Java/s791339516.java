import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static int N;
    public static HashSet<Integer> hs;
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        N = sc.nextInt();
        double[] ps = new double[N];
        int numOfTails = N >> 1;
        hs = new HashSet<Integer>();

        for(int i=0; i<N; ++i) {
            ps[i] = sc.nextDouble();
        }

        double p = 0;

        for( ;numOfTails >= 0; --numOfTails) {
            p += func(ps, 0, numOfTails);
        }

        pw.printf("%1.10f\n", p);
//        pw.println(p);
        pw.close();
    }

    public static double func(double[] ps, int begI, int tails) {
        double r = 0;

        if(0 == tails) {
            r = 1;
            for(int i=0; i<begI; ++i) {
                r *= (hs.contains(i))? (1-ps[i]): ps[i];
            }
            for(int i=begI; i<N; ++i) {
                r *= (hs.contains(i))? (1-ps[i]): ps[i];
            }

            return r;
        }

        for(int i=begI; i<N; ++i) {
            hs.add(i);
            r += func(ps, i + 1, tails - 1);
            hs.remove(i);
        }

        return r;
    }
}
