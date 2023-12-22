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
            int i;
            this.x =x;
            this.y =y;
            this.brok = brok;
            for(i=0;i<10;i++){
                this.bx[i] = bx[i];
                this.by[i] = by[i];
            }
            this.dis = dis;
        }
 
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Deque<data> qu  = new LinkedList<data>();
        int h,w,i,j,sx=-1,sy=-1,gx=-1,gy=-1,ans=-1,dx=-1,dy=-1,br=0;
        int[] xnum = {1,-1,0,0}, ynum = {0,0,1,-1},dummy=new int[10],nx = new int[10],ny = new int[10];
        int[][] ma = new int[23][23];
 
        while(true){
            data a=new data(0,0,0,dummy,dummy,0),now= new data(0,0,0,dummy,dummy,0),next = new data(0,0,0,dummy,dummy,0);
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
                dx = now.x;
                dy = now.y;
                br = now.brok;
                //System.out.println(now.x+" "+now.y+" " +now.dis);
 
                for(i=0;i<now.brok;i++){
                    ma[now.bx[i]][now.by[i]]=0;
                    nx[i] = now.bx[i];
                    ny[i] = now.by[i];
                }
 
                for(i=0;i<4;i++){
                    next = new data(now.x,now.y,br,nx,ny,now.dis);
                    dx = next.x;
                    dy = next.y;
                    //System.out.println(now.dis);
                    while(dx+xnum[i]>=1&&dx+xnum[i]<=h&&dy+ynum[i]>=1&&dy+ynum[i]<=w&&ma[dx+xnum[i]][dy+ynum[i]]!=1){
                        dx+=xnum[i];
                        dy+=ynum[i];
                        //System.out.println(next.x+" "+next.y);
                        if(ma[dx][dy]==3){
                            ans = next.dis+1;
                            break;
                        }
                        if(dx+xnum[i]>=1&&dx+xnum[i]<=h&&dy+ynum[i]>=1&&dy+ynum[i]<=w&&ma[dx+xnum[i]][dy+ynum[i]]==1){
                            nx[br]=dx+xnum[i];
                            ny[br]=dy+ynum[i];
                            //next.dis++;
                            //next.brok++;
                            //System.out.println((next.x+xnum[i])+" "+(next.y+ynum[i]));
                            //for(j=0;j<next.brok+1;j++)System.out.println(next.bx[j]+" "+next.by[j]+" "+next.brok);
 
                            //System.out.println("next"+next.x+" "+next.y+" "+next.dis);
                            if(next.dis==9)break;
                            qu.add(new data(dx,dy,br+1,nx,ny,next.dis+1));
                            //System.out.println(now.x+" "+dx+" "+now.y+" "+dy);
                            /*a = qu.getFirst();
                            next = qu.getLast();
                            System.out.println(qu.size()+" "+a.x+" "+a.y+" "+next.x+" "+next.y);
                            */
                            for(j=0;j<10;j++){
                                nx[j] = next.bx[j];
                                ny[j] = next.by[j];
                            }
                            break;
                        }
                    }
                }
                for(i=0;i<now.brok;i++){
                    ma[now.bx[i]][now.by[i]]=1;
                }
                /*for(i=1;i<=h;i++){
                    for(j=1;j<=w;j++){
                        System.out.print(ma[i][j]);
                    }
                    System.out.println();
                }
                System.out.println();*/
            }
            System.out.println(ans);
            for(i=0;i<=21;i++)for(j=0;j<=21;j++)ma[i][j]=0;
            while(qu.size()>0)qu.remove();
        }
    }
}
