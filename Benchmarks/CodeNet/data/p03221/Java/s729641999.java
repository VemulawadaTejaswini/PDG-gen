import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int M = sc.nextInt();
        final Map<Integer, List<Integer>> cityToYears = new HashMap<Integer, List<Integer>>();
        int area;
        int year;
        final int[][] inputOrder = new int[M + 1][2];
        List<Integer> years;
        for (int i = 1; i <= M; i++)
        {
            area = sc.nextInt();
            year = sc.nextInt();
            if (cityToYears.containsKey(area))
            {
                cityToYears.get(area).add(year);
            } else
            {
                years = new ArrayList<Integer>();
                years.add(year);
                cityToYears.put(area, years);
            }
            inputOrder[i][0] = area;
            inputOrder[i][1] = year;
        }

        for (final Entry<Integer, List<Integer>> entry : cityToYears.entrySet())
        {
            Collections.sort(entry.getValue());
        }
        String ansCity;
        String ansYearOrder;
        for (int i = 1; i <= M; i++)
        {
            ansCity = String.valueOf(inputOrder[i][0]);
            ansYearOrder = String.valueOf(cityToYears.get(inputOrder[i][0]).indexOf(inputOrder[i][1]) + 1);
            while (ansCity.length() < 6)
            {
                ansCity = "0" + ansCity;
            }
            while (ansYearOrder.length() < 6)
            {
                ansYearOrder = "0" + ansYearOrder;
            }
            System.out.println(ansCity + ansYearOrder);
        }
    }
}
