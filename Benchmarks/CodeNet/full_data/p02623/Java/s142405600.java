import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long k = sc.nextLong();
        long[] aSum = new long[n+1];
        long[] bSum = new long[m+1];

        aSum[0] = 0;
        bSum[0] = 0;
        int aPoint = -1;
        int bPoint = -1;
        for (int i = 1; i <= n;++i)
        {
            aSum[i] = aSum[i-1] + sc.nextLong();
            if (aPoint==-1 && aSum[i] > k) aPoint = i-1;
            else if(aPoint == -1 && aSum[i] == k) aPoint = i;
            else if (aPoint==-1 && i==n) aPoint = i;
        }

        for (int i = 1; i <= m;++i)
        {
            bSum[i] = bSum[i-1] + sc.nextLong();
            if (bPoint==-1 && bSum[i] > k) bPoint = i-1;
            else if(bPoint == -1 && bSum[i] == k) bPoint = i;
            else if(bPoint==-1 && i == m) bPoint = i;
        }

//        System.err.println("aPoint:"+aPoint);
//        StringBuilder sb1 = new StringBuilder();
//        for (int i = 0;i<aSum.length;++i) sb1.append(aSum[i]+",");
//        System.err.println(sb1.toString());
//
//        System.err.println("bPoint:"+bPoint);
//        StringBuilder sb2 = new StringBuilder();
//        for (int i = 0;i<bSum.length;++i) sb2.append(bSum[i]+",");
//        System.err.println(sb2.toString());

        int count = 0;
        long sumTime = 0;
        if (aSum[aPoint] < bSum[bPoint])
        {
            sumTime+= aSum[aPoint];
            count += aPoint;
        }
        else if (bSum[bPoint] < aSum[aPoint])
        {
            sumTime += bSum[bPoint];
            count += bPoint;
        }
        else
        {
            if (aPoint > bPoint)
            {
                sumTime+= aSum[aPoint];
                count += aPoint;
            }else
            {
                sumTime += bSum[bPoint];
                count += bPoint;
            }
        }

        if (aSum[aPoint] == sumTime)
        {
            for (int i = 0;i<=m;++i)
            {
                if (sumTime+bSum[i] == k)
                {
                    sumTime += bSum[i];
                    count += i;
                    break;
                }else if (sumTime+bSum[i] > k)
                {
                    if (i!=0) sumTime += bSum[i-1];
                    count += i-1;
                    break;
                }
            }
        }else
        {
            for (int i = 0;i<=n;++i)
            {
                if (sumTime+aSum[i] == k)
                {
                    sumTime += aSum[i];
                    count += i;
                    break;
                }else if (sumTime+aSum[i] > k)
                {
                    if(i != 0)sumTime += aSum[i-1];
                    count += i-1;
                    break;
                }
            }
        }

        //System.err.println(sumTime);
        System.out.println(count);
        sc.close();
    }
}