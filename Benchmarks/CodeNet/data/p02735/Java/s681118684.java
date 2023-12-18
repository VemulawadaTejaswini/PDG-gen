import java.util.*;
public class Main {
        static Scanner sc = new Scanner(System.in);
        static void myout(Object t){System.out.println(t);}//standard output
        static void myerr(Object t){System.err.println(t);}//standard error
        static String getStr(){return sc.next();}
        static int getInt(){return Integer.parseInt(getStr());}
        static long getLong(){return Long.parseLong(getStr());}
        static boolean hasNext(){return sc.hasNext();}
        static char[] mySplit(String str){return str.toCharArray();}
        public static void main(String[] args){
          int H = getInt();
          int W = getInt();
          char[][] list = new char[H][W];
          boolean[][] accessed = new boolean[H][W];
          int output = 10007;
          for(int i = 0; i < H; i++){
            list[i] = mySplit(getStr());
            Arrays.fill(accessed[i],false);
          }
          int[] dy = {-1,0,1,0};
          int[] dx = {0,-1,0,1};
          ArrayDeque<String> queue = new ArrayDeque<String>();
          queue.add("0,0,0");
          while(queue.size() > 0){
            String tmp2 = queue.pollFirst();
            String[] tmp = tmp2.split(",",0);
            int y = Integer.parseInt(tmp[0]);
            int x = Integer.parseInt(tmp[1]);
            int c = Integer.parseInt(tmp[2]);
            accessed[y][x] = true;
            if(list[y][x] == '#'){
              c++;
            }
            if(y == H - 1 && x == W - 1){
              output = Math.min(output,c);
            }
            for(int i = 0; i < 4; i++){
              int nextY = y + dy[i];
              int nextX = x + dx[i];
              if(nextY < H && nextY >= 0 && nextX < W && nextX >= 0){
                if(!accessed[nextY][nextX]){
                  String tmp3 = String.valueOf(nextY) + "," + String.valueOf(nextX) + "," + String.valueOf(c);
                  queue.add(tmp3);
                }
              }
            }
          }
          myout(output);
        }
        //Method addition frame start

        //Method addition frame end
}
