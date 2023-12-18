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

        double pAllHead = 1;

        for(int i=0; i<N; ++i) {
            pAllHead *= ps[i];
        }

        for( ;numOfTails >= 0; --numOfTails) {
            p += func(ps, 0, numOfTails, pAllHead);
        }

        pw.printf("%1.10f\n", p);
        // pw.println(p);
        pw.close();
    }

    public static double func(double[] ps, int begI, int tails, double pAllHead) {
        double r = 0;

        if(0 == tails && hs.size() == 0) {
            return pAllHead;
        }

        if(0 == tails) {
            r = pAllHead;
            for(int i=0; i<begI; ++i) {
                if(hs.contains(i)) {
                    r = r / ps[i] * (1 - ps[i]);
                }
            }
//            for(int i=begI; i<N; ++i) {
//                r *= (hs.contains(i))? (1-ps[i]): ps[i];
//            }
            return r;
        }

        for(int i=begI; i<N; ++i) {
            hs.add(i);
            r += func(ps, i + 1, tails - 1, pAllHead);
            hs.remove(i);
        }

        return r;
    }
}
