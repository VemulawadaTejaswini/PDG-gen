import java.util.*;

public class Main
{
    private final int[] data;
    private final int[] pos;
    private final int K;
    private final int N;

    private Main(int[] input, int K, int N)
    {
        this.data = input;
        this.K = K;
        this.N = N;

        this.pos = new int[N + 1];

        for (int i = 0; i < data.length; i++)
            pos[data[i]] = i;
    }

    public int[] solve()
    {
        for(int i = 1; i < data.length; i++)
        {
            int swapDistance;
            int val = data[i];

            if (val < N)
            {
                swapDistance = assessSwap(val, val + 1, i);
                if (swapDistance > 0)
                {
                    swap(val);
                    i--;
                    if (assessSwap(val - 1 , val, i) > 0)
                        i = pos[val - 1] - 1;
                }
            }

        }

        return data;
    }

    int assessSwap(int from, int to, int i)
    {
        int currPos = pos[from];
        int nextPos = pos[to];
        if (currPos <= i && nextPos < i && (currPos - nextPos) >= K)
            return (currPos - nextPos);
        else
            return -1;
    }

    void swap(int fromVal)
    {
        int toVal = fromVal + 1;
        int currPos = pos[fromVal];
        int nextPos = pos[toVal];

        int tmp = data[nextPos];
        data[nextPos] = fromVal;
        data[currPos] = tmp;

        pos[fromVal] = nextPos;
        pos[toVal] = currPos;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] input = new int[n];
        for (int i = 0; i<n;i++)
            input[i] = sc.nextInt();

        int[] result = new Main(input, k, n).solve();
        for (int i = 0; i < result.length - 1; i++)
            System.out.println(result[i]);

        System.out.print(result[result.length - 1]);
    }
}