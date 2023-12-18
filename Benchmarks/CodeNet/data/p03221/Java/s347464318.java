import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int M = sc.nextInt();
        final int[][] original = new int[M][3];
        final int[] yearOrder = new int[M];
        for (int i = 0; i < M; i++)
        {
            original[i][0] = i;
            original[i][1] = sc.nextInt();
            original[i][2] = sc.nextInt();
            yearOrder[i] = original[i][2];
        }
        int order1;
        int order2;
        int order3;
        for (int i = 0; i < yearOrder.length; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                if (yearOrder[j] > yearOrder[i])
                {
                    order1 = original[i][0];
                    order2 = original[i][1];
                    order3 = original[i][2];
                    yearOrder[i] = yearOrder[i] + yearOrder[j];
                    yearOrder[j] = yearOrder[i] - yearOrder[j];
                    yearOrder[i] = yearOrder[i] - yearOrder[j];

                    original[i][0] = original[j][0];
                    original[i][1] = original[j][1];
                    original[i][2] = original[j][2];

                    original[j][0] = order1;
                    original[j][1] = order2;
                    original[j][2] = order3;
                }
            }
        }

        final String[] answer = new String[M];
        String area;
        String yearOrderStr;
        int[] singleData;
        final int[] appearTimes = new int[M];
        for (int i = 0; i < M; i++)
        {
            singleData = original[i];
            area = String.valueOf(singleData[1]);
            appearTimes[singleData[1]]++;
            while (area.length() < 6)
            {
                area = "0" + area;
            }
            yearOrderStr = String.valueOf(appearTimes[singleData[1]]);
            while (yearOrderStr.length() < 6)
            {
                yearOrderStr = "0" + yearOrderStr;
            }
            answer[singleData[0]] = area + yearOrderStr;
        }
        for (final String singleResult : answer)
        {
            System.out.println(singleResult);
        }
    }
}