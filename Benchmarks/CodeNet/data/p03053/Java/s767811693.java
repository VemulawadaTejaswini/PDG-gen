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
        public static void main(String[] args){
          int H = getInt();
          int W = getInt();
          String[][] masu = new String[H][W];
          ArrayDeque<ArrayList<Integer>> q = new ArrayDeque<ArrayList<Integer>>(10);
          for(int i = 0; i < H; i++){
            masu[i] = mySplit(getStr());
            for(int j = 0; j < W; j++){
              if(masu[i][j].equals("#")){
                ArrayList<Integer> mp = new ArrayList<Integer>();
                mp.add(i);
                mp.add(j);
                mp.add(0);
                q.add(mp);
              }
            }
          }
          int output = 0;
          myerr(q);
          while(q.size() > 0){
            ArrayList<Integer> tmp = q.pollFirst();
            int y = tmp.get(0);
            int x = tmp.get(1);
            int count = tmp.get(2);
            //myerr(y + " " + x);
            output = Math.max(output,count);
            if(masu[y][x].equals(".") || masu[y][x].equals("#")){
              masu[y][x] =  String.valueOf(count);
              //myerr("通過");
            }
            if(y != 0){
              if(masu[y - 1][x].equals(".")){
                ArrayList<Integer> mp = new ArrayList<Integer>();
                mp.add(y - 1);
                mp.add(x);
                mp.add(count + 1);
                q.add(mp);
              }
            }
            if(x != 0){
              if(masu[y][x - 1].equals(".")){
                ArrayList<Integer> mp = new ArrayList<Integer>();
                mp.add(y);
                mp.add(x - 1);
                mp.add(count + 1);
                q.add(mp);
              }
            }
            if(y != H - 1){
              if(masu[y + 1][x].equals(".")){
                ArrayList<Integer> mp = new ArrayList<Integer>();
                mp.add(y + 1);
                mp.add(x);
                mp.add(count + 1);
                q.add(mp);
              }
            }
            if(x != W - 1){
              if(masu[y][x + 1].equals(".")){
                ArrayList<Integer> mp = new ArrayList<Integer>();
                mp.add(y);
                mp.add(x + 1);
                mp.add(count + 1);
                q.add(mp);
              }
            }
          }
          myout(output);
        }
        //Method addition frame start

        //Method addition frame end
}
