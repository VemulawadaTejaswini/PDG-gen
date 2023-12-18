import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int W = sc.nextInt();
        int[] w = new int[N];
        int[] v = new int[N];


        for (int i = 0; i < N; ++i)
        {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }

        int max_v = 0;
        for (int i = 0; i < (1 << N); ++i)
        {
            int ww = 0;
            int vv = 0;
            for (int j = 0; j < N; ++j)
            {
                if ((i & (1 << j)) != 0)
                {
                    ww += w[j];
                    vv += v[j];
                    if (ww > W)
                    {
                        break;
                    }
                }
            }
            if ((ww <= W) && (vv > max_v))
            {
                max_v = vv;
            }
        }

        System.out.println(max_v);
    }

}
