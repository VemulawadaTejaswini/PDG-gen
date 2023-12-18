import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by mixnector on 2017/03/04.
 */
public class Main {
    static Scanner in;
    static PrintWriter out;
    static String INPUT = "";

    public static void main(String[] args) throws Exception
    {
        in = INPUT.isEmpty() ? new Scanner(System.in) : new Scanner(INPUT);
        out = new PrintWriter(System.out);
        int N = ni();
        int K = ni();
        int[] a = new int[N];
        int i, j;
        for(i = 0; i < N; i++) a[i] = ni();
        Arrays.sort(a);

        int total = 0;
        for(i = 0; total <= K && i < N; i++) total += a[i];
        if(total <= K)
            out.println(N);
        else
        {
            for(i = 0; a[i] <= total - K; i++);
            out.println(i);
        }
        out.flush();
    }

    static int ni() {
        return Integer.parseInt(in.next());
    }

    static long nl() {
        return Long.parseLong(in.next());
    }
}
