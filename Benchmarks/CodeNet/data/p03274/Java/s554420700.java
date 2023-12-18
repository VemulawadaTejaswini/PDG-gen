import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int K = sc.nextInt();
        final boolean[] isNegative = new boolean[N];
        final long[] posiArray = new long[N];
        int count = 0;
        int posi;
        for (int i = 0; i < N; i++)
        {
            posi = sc.nextInt();
            if (posi < 0)
            {
                isNegative[i] = true;
                posiArray[i] = -2 * posi;
            } else
            {
                if (posi == 0)
                {
                    count++;
                }
                posiArray[i] = posi;
            }
        }

        for (int i = 0; i < posiArray.length; i++)
        {
            for (int j = i; j < posiArray.length; j++)
            {
                if (posiArray[j] < posiArray[i])
                {
                    final long temp = posiArray[j];
                    posiArray[j] = posiArray[i];
                    posiArray[i] = temp;
                    final boolean b = isNegative[j];
                    isNegative[j] = isNegative[i];
                    isNegative[i] = b;

                }
            }
        }
        long posiDis = 0;
        long negativeDis = 0;
        for (int i = 0; i < posiArray.length; i++)
        {
            if (posiArray[i] == 0)
            {
                continue;
            }
            count++;
            if (isNegative[i])
            {
                negativeDis = posiArray[i];
            } else
            {
                posiDis = posiArray[i];
            }

            if (count == K)
            {
                break;
            }
        }
//        final long distance1 = negativeDis + 2 * posiDis;
//        final long distance2 = 2 * negativeDis + posiDis;
        final long distance = negativeDis + posiDis;
//        System.out.println(distance1 > distance2 ? distance2 : distance1);
        System.out.println(distance);
    }
}