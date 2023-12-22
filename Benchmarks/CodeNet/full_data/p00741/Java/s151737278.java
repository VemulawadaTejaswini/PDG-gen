import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int dy[]={-1,-1,-1,0,0,1,1,1};
        int dx[]={-1,0,1,-1,1,-1,0,1};
        while (true)
        {
            int w=sc.nextInt();
            int h=sc.nextInt();
            if (w==0 && h==0) {break;}
            int field[][]=new int[h+2][w+2];
            int searched[][]=new int[h+2][w+2];
            for (int y=0;y<h+2;++y)
            {
                for (int x=0;x<w+2;++x)
                {
                    if (1 <= y && y <= h && 1 <= x && x <= w) { field[y][x]=sc.nextInt(); }
                    else {field[y][x]=0;}
                    searched[y][x]=0;
                }
            }
            int count=0;
            for (int y=1;y<=h;++y)
            {
                for (int x=1;x<=w;++x)
                {
                    if (searched[y][x]==0 && field[y][x]==1)
                    {
                        Queue<Integer> queuey=new ArrayDeque<>();
                        Queue<Integer> queuex=new ArrayDeque<>();

                        searched[y][x]=1;
                        queuey.add(y);
                        queuex.add(x);

                        while (!queuey.isEmpty())
                        {
                            int q=queuey.remove();
                            int p=queuex.remove();
                            for (int k=0;k<dy.length;++k)
                            {
                                int t=q+dy[k];
                                int r=p+dx[k];
                                if (searched[t][r]==0)
                                {
                                    searched[t][r]=1;
                                    if (field[t][r]==1)
                                    {
                                        queuey.add(t);
                                        queuex.add(r);
                                    }
                                }
                            }
                        }
                        ++count;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
