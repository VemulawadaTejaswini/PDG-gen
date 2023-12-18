import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int M = sc.nextInt();

        final List<Long> yearOrder = new ArrayList<Long>();

        int area;
        long year;
        final int[] areaArray = new int[M];
        final long[] yearArray = new long[M];
        final long[] yearCount = new long[M];
        final long[] sortYearOrder = new long[M];
        for (int i = 0; i < M; i++)
        {
            area = sc.nextInt();
            year = sc.nextInt();
            areaArray[i] = area;
            yearArray[i] = year;
            yearOrder.add(year);
            sortYearOrder[i] = year;
        }
        Arrays.sort(sortYearOrder);
        int cityIndex;
        final int[] cityCount = new int[N + 1];
        int areaNum;
        for (final long singleSortYear : sortYearOrder)
        {
            cityIndex = yearOrder.indexOf(singleSortYear);
            areaNum = areaArray[cityIndex];
            cityCount[areaNum]++;
            yearCount[cityIndex] = cityCount[areaNum];
        }

        String outPut1 = "";
        String outPut2 = "";
        for (int i = 0; i < M; i++)
        {
            outPut1 = String.valueOf(areaArray[i]);
            outPut2 = String.valueOf(yearCount[i]);
            while (outPut1.length() < 6)
            {
                outPut1 = "0" + outPut1;
            }
            while (outPut2.length() < 6)
            {
                outPut2 = "0" + outPut2;
            }
            System.out.println(outPut1 + outPut2);
        }
    }
}
