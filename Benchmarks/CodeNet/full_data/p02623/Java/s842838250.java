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
        long aSumTime = 0;
        long bSumTime = 0;

        for (int i = 0;i<n;++i)
        {
            long tmp = sc.nextLong();
            a.add(tmp);
            aSumTime += tmp;
        }

        for (int i = 0;i<m;++i)
        {
            long tmp = sc.nextLong();
            b.add(tmp);
            bSumTime += tmp;
        }

//        StringBuilder sbA = new StringBuilder("sbA");
//        for (Long aa:a) sbA.append(aa+" ");
//        System.out.println(sbA.toString());
//        StringBuilder sbB = new StringBuilder("sbB");
//        for (Long bb:b) sbB.append(bb+" ");
//        System.out.println(sbB.toString());

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
            if (aTime < bTime)
            {
                time = aTime;
                ++aInd;
                aSumTime -= aTime;
            }else if(bTime < aTime)
            {
                time = bTime;
                ++bInd;
                bSumTime -= bTime;
            }else if (aSumTime < bSumTime)
            {
                time = aTime;
                ++aInd;
                aSumTime -= aTime;
            }else//bSumTime < aSumTime
            {
                time = bTime;
                ++bInd;
                bSumTime -= bTime;
            }

            if (sumTime+time > k)
            {
                //System.out.println("@1");
                break;
            } else
            {
                //System.err.println("+"+time);
                sumTime += time;
                ++count;
            }

            if (aInd >= a.size() && bInd >= b.size())
            {
                //System.out.println("@2");
                break;
            }

        }

        //System.out.println(sumTime);
        System.out.println(count);
        sc.close();
    }
}