

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

class Point{
    int x;
    int y;
    int s;
    public Point(){
        
    }
    public Point(int x,int y,int s){
        super();
        this.x=x;
        this.y=y;
        this.s=s;
        
    }
}
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();
        int dis=0,white=0;
        char map[][]=new char[h][w];
        int book[][]=new int[h][w];
        int next[][]=new int[][]{{1,0},{0,1},{-1,0},{0,-1}}; 
        for(int i=0;i<h;i++){
            String s=sc.next();
            map[i]=s.toCharArray();
        }
        for(int i=0;i<h;i++)
            for(int j=0;j<w;j++){
                if(map[i][j]=='.') white++;
                book[i][j]=0;
            }
        ArrayDeque<Point> q=new ArrayDeque<Point>();
        Point start=new Point(0,0,1);
        book[0][0]=1;
        q.add(start);
        while(!q.isEmpty()){
            Point now=q.poll();
            int nowx,nowy,nows; 
            if(now.x==h-1&&now.y==w-1){
         //       System.out.println(now.s);
                dis=now.s;
                break;
            }
            for(int i=0;i<4;i++){
                nowx=now.x+next[i][0];
                nowy=now.y+next[i][1];
                if(nowx<0||nowx>=h||nowy<0||nowy>=w)
                    continue;
                if(book[nowx][nowy]==0&&map[nowx][nowy]=='.'){
                    book[nowx][nowy]=1;
                    nows=now.s+1;
                    q.add(new Point(nowx,nowy,nows));
                }
                
            }
        }
     //   System.out.println(white);
    if(dis>0)    System.out.println(white-dis);
    else System.out.println("-1");
        
        
    }
}
