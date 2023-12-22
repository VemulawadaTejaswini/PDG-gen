import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
    private static final int MAX_N = (int) 1e6 + 16;
    private static int[] primes = new int[MAX_N];
    private static int[] acc = new int[MAX_N];

    private static void init()
    {
        int[] number = new int[MAX_N];
        number[0] = 1;
        number[1] = 1;
        for (int i = 2; i < MAX_N; i++)
        {
            if (number[i] == 0)
            {
                primes[i] = 1;
                for (int j = i*i; j < MAX_N; j += i)
                {
                    if (j < 0) break;
                    number[j] = 1;
                }
            }
        }

        for (int i = 1; i < MAX_N; i++)
        {
            acc[i] = primes[i] + acc[i-1];
        }
    }

    public static void main(String[] args) throws IOException
    {
        init();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null)
        {
            sb.append(String.format("%d\n", acc[Integer.parseInt(line)]));
        }
        System.out.print(sb.toString());
    }
}