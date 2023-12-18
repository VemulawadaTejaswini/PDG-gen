import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by hikigineer on 2017/03/04.
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
        int M = ni();

        int ab[][] = new int[N][3];
        int cd[][] = new int[M][2];

        int i, j;
        for(i = 0; i < N; i++)
        {
            ab[i][0] = ni();
            ab[i][1] = ni();
            ab[i][2] = -1;
        }
        for(i = 0; i < M; i++)
        {
            cd[i][0] = ni();
            cd[i][1] = ni();
        }

        for(i = 0; i < N; i++)
        {
            int min = 100000000;
            for(j = M - 1; j >= 0; j--)
            {
                int distance = Math.abs(ab[i][0] - cd[j][0]) + Math.abs(ab[i][1] - cd[j][1]);
                if(min >= distance)
                {
                    min = distance;
                    ab[i][2] = j + 1;
                }
            }
        }

        for(i = 0; i < N; i++) out.println(ab[i][2]);
        out.flush();
    }

    static int ni() {
        return Integer.parseInt(in.next());
    }

}