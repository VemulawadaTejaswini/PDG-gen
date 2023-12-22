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

        int[] yPoint = new int[y];
        Arrays.fill(yPoint, 0);
        int[] xPoint = new int[x];
        Arrays.fill(xPoint, 0);

        boolean[][] map = new boolean[y][x];
        for (int i = 0;i<map.length;++i) Arrays.fill(map[i],false);

        for (int i = 0;i<m;++i)
        {
            int mY = sc.nextInt() - 1;
            int mX = sc.nextInt() - 1;
            ++yPoint[mY];
            ++xPoint[mX];
            map[mY][mX] = true;
        }
        sc.close();

        int yMax = -1;
        List<Integer> yms = new ArrayList<>();
        for (int i = 0;i<y;++i)
        {
            if (yMax < yPoint[i])
            {
                yMax = yPoint[i];
                yms.clear();
                yms.add(i);
            }else if (yMax == yPoint[i]) yms.add(i);
        }

        int xMax = -1;
        List<Integer> xms = new ArrayList<>();
        for (int i = 0;i<x;++i)
        {
            if (xMax < xPoint[i])
            {
                xMax = xPoint[i];
                xms.clear();
                xms.add(i);
            }else if (xMax == xPoint[i]) xms.add(i);
        }

        boolean flag = false;
        for (Integer yy:yms)
        {
            for (Integer xx:xms)
            {
                if (!map[yy][xx])
                {
                    flag = true;
                    break;
                }
            }
            if (flag) break;
        }

        if (flag) System.out.println(yMax + xMax);
        else System.out.println(yMax + xMax - 1);

//        long end = System.currentTimeMillis();
//        System.err.println((end-start)+"ms");
    }
}