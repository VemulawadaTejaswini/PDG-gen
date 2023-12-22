import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        //long start = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int x = sc.nextInt();
        int m = sc.nextInt();

        int[] xPoint = new int[x+1];
        Arrays.fill(xPoint, 0);
        int[] yPoint = new int[y+1];
        Arrays.fill(yPoint, 0);

        boolean[][] map = new boolean[y+1][x+1];
        for (int i = 0;i<map.length;++i) Arrays.fill(map[i],false);

        for (int i = 0;i<m;++i)
        {
            int mY = sc.nextInt();
            int mX = sc.nextInt();
            ++xPoint[mX];
            ++yPoint[mY];
            map[mY][mX] = true;
        }

        sc.close();

        int xMax = Integer.MIN_VALUE;
        List<Integer> ansXList = new ArrayList<>();
        for (int i = 1;i<xPoint.length;++i)
        {
            if (xMax < xPoint[i])
            {
                xMax = xPoint[i];

                ansXList.clear();
                ansXList.add(i);
            }else if (xMax == xPoint[i]) ansXList.add(i);
        }

        int yMax = Integer.MIN_VALUE;
        List<Integer> ansYList = new ArrayList<>();
        for (int i = 1;i<yPoint.length;++i)
        {
            if (yMax < yPoint[i])
            {
                yMax = yPoint[i];

                ansYList.clear();
                ansYList.add(i);
            }else if (yMax == yPoint[i]) ansYList.add(i);
        }


        boolean flag = false;
        for (Integer yy : ansYList)
        {
            for (Integer xx : ansXList)
            {
                if (!map[y][x])
                {
                    flag = true;
                    break;
                }
            }
        }

        long ans;
        if (flag)
        {
            ans = xMax + yMax;
        }else
        {
            ans = xMax + yMax -1;
        }

        System.out.println(ans);

//        long end = System.currentTimeMillis();
//        System.err.println((end-start)+"ms");
    }
}