import java.util.Scanner;
import java.util.LinkedList;
import java.util.Deque;

public class Main{
    static class data{
        int x;
        int y;
        int brok;
        int[] bx = new int[10];
        int[] by = new int[10];
        int dis;
        public data(int x,int y, int brok,int[] bx,int[] by,int dis){
            this.x =x;
            this.y =y;
            this.brok = brok;
            this.bx = bx;
            this.by = by;
            this.dis = dis;
        }

    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Deque<data> qu  = new LinkedList<data>();
        int h,w,i,j,sx=-1,sy=-1,gx=-1,gy=-1,ans=-1;
        int[] xnum = {1,-1,0,0}, ynum = {0,0,1,-1},dummy=new int[10];
        int[][] ma = new int[23][23];
        data a=new data(0,0,0,dummy,dummy,0),now= a,next = a;
        while(true){
            w = s.nextInt();
            h = s.nextInt();
            if(w+h==0)break;
            ans = -1;
            a.brok=0;
            a.dis = 0;
            for(i=1;i<=h;i++){
                for(j=1;j<=w;j++){
                    ma[i][j]=s.nextInt();
                    if(ma[i][j]==2){
                        a.x = i;
                        a.y = j;
                        ma[i][j]=0;
                    }
                }
            }
            qu.add(new data(a.x,a.y,0,dummy,dummy,0));
            while(qu.size()>0&&ans==-1){
                now = qu.removeFirst();
                //System.out.println(now.x+" "+now.y+" " +now.dis);

                for(i=0;i<now.brok;i++){
                    ma[now.bx[i]][now.by[i]]=0;
                }
                for(i=0;i<4;i++){
                    next = new data(now.x,now.y,now.brok,now.bx,now.by,now.dis);
                    //System.out.println(now.dis);
                    while(next.x+xnum[i]>=1&&next.x+xnum[i]<=h&&next.y+ynum[i]>=1&&next.y+ynum[i]<=w&&ma[next.x+xnum[i]][next.y+ynum[i]]!=1){
                        next.x+=xnum[i];
                        next.y+=ynum[i];
                        //System.out.println(next.x+" "+next.y);
                        if(ma[next.x][next.y]==3){
                            ans = next.dis+1;
                            break;
                        }
                        if(next.x+xnum[i]>=1&&next.x+xnum[i]<=h&&next.y+ynum[i]>=1&&next.y+ynum[i]<=w&&ma[next.x+xnum[i]][next.y+ynum[i]]==1){
                            next.bx[next.brok]=next.x+xnum[i];
                            next.by[next.brok]=next.y+ynum[i];
                            //next.dis++;
                            //next.brok++;
                            ma[next.x+xnum[i]][next.y+ynum[i]]=0;
                            //System.out.println("next"+next.x+" "+next.y+" "+next.dis);
                            if(next.dis+1==10)break;
                            qu.add(new data(next.x,next.y,next.brok+1,next.bx,next.by,next.dis+1));
                            /*a = qu.getFirst();
                            next = qu.getLast();
                            System.out.println(qu.size()+" "+a.x+" "+a.y+" "+next.x+" "+next.y);
                            */
                            break;
                        }
                    }
                }
                for(i=0;i<now.brok;i++){
                    ma[now.bx[i]][now.by[i]]=1;
                }
            }
            System.out.println(ans);
            for(i=1;i<=h;i++)for(j=1;j<=w;j++)ma[i][j]=0;
        }
    }
}

