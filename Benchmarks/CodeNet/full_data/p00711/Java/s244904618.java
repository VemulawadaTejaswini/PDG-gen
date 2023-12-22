import java.util.*;

class Main{
   public static void main(String a[]) throws java.io.IOException{
       Scanner scan =new Scanner (System.in);
       Pair pair= new Pair();
       Queue<Pair> fifo = new LinkedList<Pair>();

       while(true){
           int W =scan.nextInt();
           int H =scan.nextInt();
           if((W|H)==0)break;
           String [][] map = new String[H][W];
           for(int i=0;i<H;i++){
               String [] tmp =scan.next().split("\\B");
               for(int j=0;j<W;j++){
                   map[i][j] = tmp[j];
                   if(tmp[j].equals("@")){
                       pair.x=j;
                       pair.y=i;
                       fifo.add(pair);
                   }
               }
           }
          int count =0;
          while(fifo.peek()!=null){  
           pair = fifo.poll();
           int x=pair.x;
           int y=pair.y;
           int[] dx ={0,1,0,-1};
           int[] dy ={1,0,-1,0};
           map[y][x] = "#";
          for(int i=0;i<4;i++){
              int nx =x+dx[i];
              int ny =y+dy[i];
              if(0<=nx&&nx<W&&0<=ny&&ny<H&&!(map[ny][nx].equals("#"))){
                  pair.x=nx;
                  pair.y=ny;
                  fifo.add(pair);
                  count++;
              }
          }
          }
          System.out.println(count);

       }
       }
}

class Pair{
    public int x;
    public int y;
}