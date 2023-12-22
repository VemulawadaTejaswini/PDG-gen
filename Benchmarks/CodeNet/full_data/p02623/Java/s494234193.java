import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long k = sc.nextLong();
        List<Long> a = new ArrayList<>();
        List<Long> b = new ArrayList<>();
        for (int i = 0;i<n;++i) a.add(sc.nextLong());
        for (int i = 0;i<m;++i) b.add(sc.nextLong());

        int aInd = 0;
        int bInd = 0;
        long sumTime = 0;
        long count = 0;

        while (sumTime < k)
        {
            long aTime;
            long bTime;
            if (aInd >= a.size()) aTime = Long.MAX_VALUE;
            else aTime = a.get(aInd);

            if (bInd >= b.size()) bTime = Long.MAX_VALUE;
            else bTime = b.get(bInd);

            long time;
            if (aTime <= bTime)
            {
                time = aTime;
                ++aInd;
            }else
            {
                time = bTime;
                ++bInd;
            }

            if (sumTime+time > k)
            {
                //System.out.println("@2");
                break;
            }else
            {
                sumTime += time;
                ++count;
                //System.out.println("+"+time);
            }

            if (aInd >= a.size() && bInd >= b.size())
            {
                //System.out.println("@1");
                break;
            }
        }

        //System.out.println(sumTime);

        System.out.println(count);
        sc.close();
    }
}