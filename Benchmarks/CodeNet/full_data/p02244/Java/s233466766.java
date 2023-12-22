import java.util.*;

class Main
{
    static final int N = 8;
    static int[]r = new int[N];
    static int[]c = new int[N];
    static int[]dp = new int[2 * N - 1];
    static int[]dn = new int[2 * N - 1];

    static boolean[][]X = new boolean[N][N];

    public static void initialize()
    {
        for(int i = 0; i < r.length; i++)
            {
                r[i] = -1;
                c[i] = -1;
            }

        for(int i = 0; i < dp.length; i++)
            {
                dp[i] = -1;
                dn[i] = -1;
            }
    }

    public static void print()
    {
        Scanner In = new Scanner(System.in);

         for(int i = 0; i < N; i++)
            {
                for(int j = 0; j < N; j++)
                    {
                        if(X[i][j])
                            {
                                if(r[i] != j)
                                    return;
                            }
                    }
            }

        for(int i = 0; i < N; i++)
            {
                for(int j = 0; j < N; j++)
                    {
                        if(r[i] == j)
                            System.out.print("Q");
                        else
                            System.out.print(".");
                    }
                System.out.println();
            }
    }

    public static void recu(int i)
    {
        if(i == N)
            {
                print();
                return;
            }

        for(int j = 0; j < N; j++)
            {
                if(c[j] == 1 || dp[i + j] == 1 || dn[i - j + N - 1] == 1)
                    continue;

                r[i] = j;
                c[j] = dp[i + j] = dn[i - j + N - 1] = 1;

                recu(i + 1);

                r[i] = c[j] = dp[i + j] = dn[i - j + N - 1] = -1;
            }
    }

    public static void main(String[] args)
    {
        Scanner In = new Scanner(System.in);

        initialize();

        for(int i = 0; i < N; i++)
            for(int j = 0; j < N; j++) X[i][j] = false;

        int k = In.nextInt();

        for(int i = 0; i < k; i++)
            {
                int ro = In.nextInt();
                int co = In.nextInt();
                X[ro][co] = true;
            }

        recu(0);
    }
}