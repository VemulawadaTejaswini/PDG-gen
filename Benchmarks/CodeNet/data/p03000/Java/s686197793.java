import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    static final int MAX = 100100;
    InputStream in = System.in;
    PrintStream out = System.out;
    // static int dp[][] = new int[MAX][MAX];
    static int L[] = new int[110];

    public void _main(String[] args) {
        Scanner sc = new Scanner(in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        for(int i=0;i<N;i++) L[i] = sc.nextInt();

        int d=0,i=0;
        while (d<=X) {
            d += L[i++];
        }
        out.println(i);
    }

    public static void Main(String[] args) {
        new Main()._main(args);
    }
}
