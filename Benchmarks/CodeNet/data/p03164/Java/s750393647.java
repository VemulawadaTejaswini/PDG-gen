
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static long wt[];
    static int val[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        wt = new long[N];
        val = new int[N];
        for(int i = 0 ; i < N ; i++)
        {
            wt[i] = sc.nextLong();
            val[i] = sc.nextInt();
        }
        System.out.println(knapSack(W , N));

    }

    static long knapSack(long W, int n)
    {
        if (n == 0 || W == 0)
            return 0;
        if (wt[n-1] > W)
            return knapSack(W, n-1);
        else return Math.max( val[n-1] + knapSack(W-wt[n-1], n-1),
                knapSack(W, n-1));
    }
}
