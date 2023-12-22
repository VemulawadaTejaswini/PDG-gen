import java.util.AbstractMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int w=scan.nextInt();
        int h=scan.nextInt();
        int[] dx=new int[8];
        int[] dy=new int[8];
        dx[0]=1;dx[1]=0;dx[2]=0;dx[3]=-1;dx[5]=1;dx[6]=-1;dx[7]=1;dx[4]=-1;
        dy[0]=0;dy[1]=1;dy[2]=-1;dy[3]=0;dy[5]=1;dy[6]=-1;dy[7]=-1;dy[4]=1;
        while(w>0&&h>0){
            int ans=0;
            char[][] c=new char[60][60];
            boolean[][] color=new boolean[60][60];
            for(int i=0;i<h;i++){
                for(int j=0;j<w;j++){
                    c[i][j]=scan.next().charAt(0);
                    color[i][j]=false;
                }
            }
            for(int i=0;i<h;i++){
                for(int j=0;j<w;j++){
                    if(color[i][j]==true)continue;
                    if(c[i][j]=='0')continue;
                    Queue<AbstractMap.SimpleEntry<Integer, Integer>> Q = new LinkedList<>();
                    AbstractMap.SimpleEntry<Integer, Integer> start = new AbstractMap.SimpleEntry<>(i, j);
                    Q.offer(start);
                    color[i][j]=true;
                    while(!(Q.size()==0)){
                        AbstractMap.SimpleEntry<Integer, Integer> now=Q.poll();
                        int x=now.getKey();
                        int y=now.getValue();
                        for(int k=0;k<8;k++){
                            int nx=x+dx[k];
                            int ny=y+dy[k];
                            if(nx>=0&&nx<h&&ny>=0&&ny<w){
                                if(color[nx][ny]==false&&c[nx][ny]=='1'){
                                    AbstractMap.SimpleEntry<Integer, Integer> nxy = new AbstractMap.SimpleEntry<>(nx,ny);
                                    color[nx][ny]=true;
                                    Q.offer(nxy);
                                }
                            }
                        }
                    }
                    ans++;
                }
            }
            System.out.println(ans);
            w=scan.nextInt();
            h=scan.nextInt();
        }
    }
}
