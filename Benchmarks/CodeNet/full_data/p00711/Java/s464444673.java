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
           char  [][] map = new char [H][W];
           for(int i=0;i<H;i++){
               String  tmp =scan.next();
               for(int j=0;j<W;j++){
                   map[i][j] = tmp.charAt(j);
                   if(tmp.charAt(j)=='@'){
                       
                       pair.x=j;
                       pair.y=i;
                       fifo.add(pair);
                       map[i][j] = '#';
                   }
               }
           }
          int count =1;
          while(fifo.peek()!=null){  
           pair = fifo.poll();
           int x=pair.x;
           int y=pair.y;
           int[] dx ={0,1,0,-1};
           int[] dy ={1,0,-1,0};
          for(int i=0;i<4;i++){
              int nx =x+dx[i];
              int ny =y+dy[i];
              if(0<=nx&&nx<W&&0<=ny&&ny<H&&map[ny][nx]!='#'){
                  Pair npair =new Pair();
                  npair.x=nx;
                  npair.y=ny;
                  fifo.add(npair);
                  map[ny][nx] = '#';
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