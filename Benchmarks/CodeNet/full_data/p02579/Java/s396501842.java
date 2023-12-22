import java.io.*;
import java.util.*;
class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String s[]=bu.readLine().split(" ");
        int h=Integer.parseInt(s[0]),w=Integer.parseInt(s[1]),i,j;
        s=bu.readLine().split(" ");
        int sx=Integer.parseInt(s[0])-1,sy=Integer.parseInt(s[1])-1;
        s=bu.readLine().split(" ");
        int ex=Integer.parseInt(s[0])-1,ey=Integer.parseInt(s[1])-1;
        char g[][]=new char[h][w]; boolean v[][]=new boolean[h][w],v2[][]=new boolean[h][w];
        for(i=0;i<h;i++)
        {
            String st=bu.readLine();
            for(j=0;j<w;j++)
            g[i][j]=st.charAt(j);
        }

        Queue<Point> q=new LinkedList<>();
        q.add(new Point(sx,sy));
        v[sx][sy]=true;
        int mvs[][]={{-1,0},{0,-1},{0,1},{1,0}};
        while(!q.isEmpty())
        {
            Point p=q.poll();
            for(int[] mv:mvs)
            {
                if(!in(h,w,p.x+mv[0],p.y+mv[1])) continue;
                int xx=p.x+mv[0],yy=p.y+mv[1];
                if(g[xx][yy]=='.' && !v[xx][yy])
                {
                    v[xx][yy]=true;
                    q.add(new Point(xx,yy));
                }
            }
        }
        if(v[ex][ey]) {System.out.print("0"); return;}

        q.add(new Point(ex,ey));
        v2[ex][ey]=true;
        while(!q.isEmpty())
        {
            Point p=q.poll();
            for(int[] mv:mvs)
            {
                if(!in(h,w,p.x+mv[0],p.y+mv[1])) continue;
                int xx=p.x+mv[0],yy=p.y+mv[1];
                if(g[xx][yy]=='.' && !v2[xx][yy])
                {
                    v2[xx][yy]=true;
                    q.add(new Point(xx,yy));
                }
            }
        }

        int d[][]=new int[h][w];
        for(i=0;i<h;i++)
        for(j=0;j<w;j++)
        {
            d[i][j]=Integer.MAX_VALUE;
            if(v2[i][j])
            {
                q.add(new Point(i,j));
                d[i][j]=0;
            }
        }

        int ans=Integer.MAX_VALUE;
        while(!q.isEmpty())
        {
            Point p=q.poll();
            if(v[p.x][p.y]) ans=Math.min(ans,d[p.x][p.y]);
            for(i=p.x-2;i<=p.x+2;i++)
            for(j=p.y-2;j<=p.y+2;j++)
            if(in(h,w,i,j) && !v2[i][j] && g[i][j]=='.')
            {
                q.add(new Point(i,j));
                v2[i][j]=true;
                d[i][j]=Math.min(d[i][j],d[p.x][p.y]+1);
            }
        }
        if(ans==Integer.MAX_VALUE) ans=-1;
        System.out.print(ans);
    }

    static boolean in(int n,int m,int x,int y)
    {
        if(x>=0 && x<n && y>=0 && y<m) return true;
        return false;
    }

    static class Point
    {
        int x,y;
        Point(int a,int b)
        {
            x=a;
            y=b;
        }
    }
}
