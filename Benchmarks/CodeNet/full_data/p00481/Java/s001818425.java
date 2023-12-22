import java.util.*;
import java.awt.Point;

 
class Main{
   public static void main(String a[]) throws java.io.IOException{
       Scanner scan =new Scanner (System.in);
       Point p= new Point();
       
 
       while(true){
 
           int H =scan.nextInt();
           int W =scan.nextInt();
           int N =scan.nextInt();
           if((W|H)==0)break;
           int  [][] map = new int [H][W];
           
           for(int i=0;i<H;i++){
               String  tmp =scan.next();
               for(int j=0;j<W;j++){
                   map[i][j] = tmp.charAt(j);
                   
                   if(tmp.charAt(j)=='S'){    
                       p.x=j;
                       p.y=i;  
                   }
                   
               }
           }
           int ans=0;
       for(int i=1;i<=N;i++){
    	   Queue<Point> fifo = new LinkedList<Point>();
    	   fifo.add(p);
    	   int [][] dis =new int[H][W];
    	   for(int j=0;j<H;j++)
    		   for(int k=0;k<W;k++)
    			   dis[j][k] =10000000;
    	   dis[p.y][p.x]=0;
          while(fifo.peek()!=null){ 
           p = fifo.poll();
           int x=p.x;
           int y=p.y;
          if(map[y][x]==Integer.toString(i).charAt(0))break;
           int[] dx ={0,1,0,-1};
           int[] dy ={1,0,-1,0};
          for(int j=0;j<4;j++){
              int nx =x+dx[j];
              int ny =y+dy[j];
              if(0<=nx&&nx<W&&0<=ny&&ny<H&&map[ny][nx]!='X'&&dis[ny][nx]==10000000){
                  Point np =new Point();
                  np.x=nx;
                  np.y=ny;
                  fifo.add(np);
                  dis[ny][nx]=dis[y][x]+1;
                  
              }
          }
          }       
         // int min =1000000;
          //for(int []es:dis)
        	//  for(int e : es)
        	  //min=Math.min(min, e);
          ans+=dis[p.y][p.x];
       }
       
       System.out.println(ans);
       
   }
   
}}
       