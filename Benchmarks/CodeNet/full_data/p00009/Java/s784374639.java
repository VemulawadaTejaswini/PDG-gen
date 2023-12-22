import java.util.*;

public class Main
{
    private static final int MAX_N = (int) 1e6 + 16;
    private static TreeSet<Integer> set = new TreeSet<>();
    private static int[] acc = new int[MAX_N];

    private static void init()
    {
        int[] number = new int[MAX_N];
        Arrays.fill(number, 0);
        Arrays.fill(acc, 0);
        number[0] = 1;
        number[1] = 1;
        for (int i = 2; i < MAX_N; i++)
        {
            if (number[i] == 0)
            {
                set.add(i);
                for (int j = i*i; j < MAX_N; j += i)
                {
                    if (j < 0) break;
                    number[j] = 1;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        init();
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (in.hasNext())
        {
            int k = in.nextInt();
            sb.append(String.format("%d\n", (set.size() - set.tailSet(k).size() + (set.contains(k) ? 1 : 0))));
        }
        System.out.print(sb.toString());
    }
}