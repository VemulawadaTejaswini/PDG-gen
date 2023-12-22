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
        for (int i = 0;i<=y;++i) Arrays.fill(map[i],false);

        for (int i = 0;i<m;++i)
        {
            int mY = sc.nextInt();
            int mX = sc.nextInt();
            ++xPoint[mX];
            ++yPoint[mY];
            map[mY][mX] = true;
        }

//        for (int i = 1;i<map.length;++i)
//        {
//            StringBuilder stb = new StringBuilder();
//            for (int j = 1;j<map[i].length;++j)
//            {
//                stb.append(map[i][j]+",");
//            }
//            System.err.println(stb.toString());
//        }

//        for (int i = 1;i<xPoint.length;++i) System.err.println(xPoint[i]);
//        System.err.println();
//        for (int i = 1;i<yPoint.length;++i) System.err.println(yPoint[i]);
//        System.err.println();

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
        int ansX;
        int ansY;
        for (int i = 0;i<ansYList.size();++i)
        {
            for (int j = 0;j<ansXList.size();++j)
            {
                if (!map[ansYList.get(i)][ansXList.get(j)])
                {
                    ansX = ansXList.get(j);
                    ansY = ansYList.get(i);
                    flag = true;
                    break;
                }
            }
        }

        int ans;
        if (flag)
        {
            ans = xMax + yMax;
        }else
        {
            ans = xMax + yMax -1;
        }

        System.out.println(ans);
        sc.close();



//        long end = System.currentTimeMillis();
//        System.err.println((end-start)+"ms");
    }
}