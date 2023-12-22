import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main{
    public static void main(String[] aaa){
        Scanner s = new Scanner(System.in);
        Deque<xy>  sta = new ArrayDeque<xy>();
        int h,w,i,j,k,l,count=0;
        int[][] memo = new int[51][51];
        xy now=new xy(),next=new xy();
        while(true){
        h = s.nextInt();
        w = s.nextInt();
        if(h==0&&w==0)break;
        for(i=1;i<=h;i++){
            for(j=1;j<=w;j++){
                memo[i][j] = s.nextInt();
            }
        }
        for(i=1;i<=h;i++){
            for(j=1;j<=w;j++){
                if(memo[i][j]==1){
                    memo[i][j]=0;
                    now.x = i;
                    now.y = j;
                    sta.push(now);
                    //System.out.println("now"+now.x+" "+now.y);
                    while(sta.size()>0){
                        now=sta.pop();
                        
                        //System.out.println("a"+now.x+" "+now.y);
                        for(k=-1;k<=1;k++){
                            for(l=-1;l<=1;l++){
                                /*next.x = now.x+k;
                                next.y = now.y+l;
                                System.out.println("kl"+k+" "+l+" "+now.x+" "+now.y);
                                System.out.println(next.x+" "+next.y);
                                if(next.x>=1&&next.x<=h&&next.y>=1&&next.y<=w&&memo[next.x][next.y]==1){
                                    memo[next.x][next.y]=0;
                                    System.out.println("push"+next.x+" "+next.y);
                                    sta.push(next);*/
                                if((now.x+k)>=1&&(now.x+k)<=h&&(now.y+l)>=1&&(now.y+l)<=w&&memo[now.x+k][now.y+l]==1){
                                    memo[now.x+k][now.y+l]=0;
                                    next.x=now.x+k;
                                    next.y=now.y+l;
                                    sta.push(next);
                                
                                }
                            }
                        }
                    }
                    count++;
                }
            }
        }
        System.out.println(count);
        count =0;
        for(i=1;i<=50;i++)for(j=1;j<=50;j++)memo[i][j]=0;
    }
    }
}
class xy{
    int x;
    int y;
}
