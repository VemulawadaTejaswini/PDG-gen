import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int K = sc.nextInt();
        final List<Integer> pointGt = new ArrayList<Integer>();
        final List<Integer> pointLt = new ArrayList<Integer>();
        int input;
        for (int i = 0; i < N; i++)
        {
            input = sc.nextInt();
            if (input < 0)
            {
                pointLt.add(input);
            } else
            {
                pointGt.add(input);
            }
        }
        Collections.sort(pointGt);
        Collections.sort(pointLt);
        Collections.reverse(pointLt);
        final int maxLength = pointGt.size() >= pointLt.size() ? pointGt.size() : pointLt.size();
        int currLtIndex = 0;
        int currGtIndex = 0;
        int count = 0;
        for (int i = 0; i < maxLength * 2; i++)
        {
            if (currLtIndex < pointLt.size() && currGtIndex < pointGt.size())
            {
                if (pointGt.get(currGtIndex) + pointLt.get(currLtIndex) < 0)
                {
                    currGtIndex++;
                } else
                {
                    currLtIndex++;
                }
            } else if (currLtIndex >= pointLt.size())
            {
                currGtIndex++;
            } else if (currGtIndex >= pointGt.size())
            {
                currLtIndex++;
            }
            count++;
            if (count == K)
            {
                break;
            }
        }

        int time1 = 0;
        if (pointGt.size() == 0)
        {
            time1 = -pointLt.get(currLtIndex - 1);
        } else if (pointLt.size() == 0)
        {
            time1 = 2 * pointGt.get(currGtIndex - 1);
        } else
        {
            time1 = 2 * pointGt.get(currGtIndex - 1) - pointLt.get(currLtIndex - 1);
        }

        int time2 = 0;
        if (pointGt.size() == 0)
        {
            time2 = -2 * pointLt.get(currLtIndex - 1);
        } else if (pointLt.size() == 0)
        {
            time2 = pointGt.get(currGtIndex - 1);
        } else
        {
            time2 = pointGt.get(currGtIndex - 1) - 2 * pointLt.get(currLtIndex - 1);
        }
        System.out.println(time1 <= time2 ? time1 : time2);
    }
}
