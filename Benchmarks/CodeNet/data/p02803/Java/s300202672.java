import java.util.*;
public class Main {
        static Scanner sc = new Scanner(System.in);
        static void myout(Object t){System.out.println(t);}//standard output
        static void myerr(Object t){System.err.println(t);}//standard error
        static String getStr(){return sc.next();}
        static int getInt(){return Integer.parseInt(getStr());}
        static long getLong(){return Long.parseLong(getStr());}
        static boolean isNext(){return sc.hasNext();}
        static String[] mySplit(String str){return str.split("");}
          static String[][] str;
          
        public static void main(String[] args){
          int H = getInt();
          int W = getInt();
          int output = 0;
          str = new String[H][W];
          for(int i = 0; i < H; i++){
            str[i] = mySplit(getStr());
          }
          
          for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
              if(".".equals(str[i][j])){
                output = Math.max(output,bfsLabi(i,j,H,W));
              }
            }
          }
          myout(output);
        }
        //便利メソッド追加枠ここから
public static class Mynode {
  int positionX;
  int positionY;
  int count;
  void Mynode(){}
}
  
//幅優先探索でスタート地点から一番遠いところまでの距離を返す
public static int bfsLabi(int startY, int startX,int H, int W){
  boolean[][] accessed = new boolean[H][W];
  for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
              accessed[i][j] = false;
            }
          }
  ArrayDeque<Mynode> aq = new ArrayDeque<Mynode>();
  int max = 0;
          Mynode firstQ = new Mynode();
          firstQ.positionX = startX;
          firstQ.positionY = startY;
          firstQ.count = 0;
          aq.add(firstQ);
          accessed[startY][startX] = true;
          while(aq.size() != 0){
            Mynode getNode = aq.pollFirst();
            int getNodeX = getNode.positionX;
            int getNodeY = getNode.positionY;
            max = Math.max(max,getNode.count);
            int left = getNodeX -1;
            int right = getNodeX +1;
            int up = getNodeY -1;
            int down = getNodeY +1;
            int nextCount = getNode.count + 1;
            if(left >= 0 && ".".equals(str[getNodeY][left]) && !accessed[getNodeY][left]){
              Mynode leftNode = new Mynode();
              leftNode.positionX = left;
              leftNode.positionY = getNode.positionY;
              leftNode.count = nextCount;
              aq.add(leftNode);
              accessed[getNodeY][left] = true;
            }
            if(right < W && ".".equals(str[getNodeY][right]) && !accessed[getNodeY][right]){
              Mynode rightNode = new Mynode();
              rightNode.positionX = right;
              rightNode.positionY = getNode.positionY;
              rightNode.count = nextCount;
              aq.add(rightNode);
              accessed[getNodeY][right] = true;
            }
            if(up >= 0 && ".".equals(str[up][getNodeX]) && !accessed[up][getNodeX]){
              Mynode upNode = new Mynode();
              upNode.positionX = getNode.positionX;
              upNode.positionY = up;
              upNode.count = nextCount;
              aq.add(upNode);
              accessed[up][getNodeX] = true;
            }
            if(down < H && ".".equals(str[down][getNodeX]) && !accessed[down][getNodeX]){
              Mynode downNode = new Mynode();
              downNode.positionX = getNode.positionX;
              downNode.positionY = down;
              downNode.count = nextCount;
              aq.add(downNode);
              accessed[down][getNodeX] = true;
            }
          }
  myerr(max);
  return max;
}
        //便利メソッド追加枠ここまで
}
