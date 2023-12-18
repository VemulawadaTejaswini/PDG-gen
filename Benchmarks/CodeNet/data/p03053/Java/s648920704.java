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
          char[][] masu = new char[H][W];
          ArrayDeque<ArrayList<Integer>> q = new ArrayDeque<ArrayList<Integer>>(10000);
          for(int i = 0; i < H; i++){
            String test = getStr();
            for(int j = 0; j < W; j++){
              masu[i][j] = test.charAt(j);
              if(masu[i][j] == '#'){
                ArrayList<Integer> mp = new ArrayList<Integer>();
                mp.add(i);
                mp.add(j);
                mp.add(0);
                q.add(mp);
                mp = null;
              }
            }
          }
          int output = 0;
          
          
          //myerr(q);
          while(q.size() > 0){
            ArrayList<Integer> tmp = q.pollFirst();
            int y = tmp.get(0);
            int x = tmp.get(1);
            int count = tmp.get(2);
            //myerr(y + " " + x);
            output = Math.max(output,count);
            if(y != 0 && masu[y - 1][x] == '.'){
                ArrayList<Integer> mp = new ArrayList<Integer>();
                mp.add(y - 1);
                mp.add(x);
                masu[y - 1][x] = '#';
                mp.add(count + 1);
                q.add(mp);
                mp = null;
            }
            if(x != 0 && masu[y][x - 1] == '.'){
                ArrayList<Integer> mp = new ArrayList<Integer>();
                mp.add(y);
                mp.add(x - 1);
              	masu[y][x - 1] = '#';
                mp.add(count + 1);
                q.add(mp);
                mp = null;
            }
            if(y != H - 1 && masu[y + 1][x] == '.'){
                ArrayList<Integer> mp = new ArrayList<Integer>();
                mp.add(y + 1);
                mp.add(x);
              	masu[y + 1][x] = '#';
                mp.add(count + 1);
                q.add(mp);
                mp = null;
            }
            if(x != W - 1 && masu[y][x + 1] == '.'){
                ArrayList<Integer> mp = new ArrayList<Integer>();
                mp.add(y);
                mp.add(x + 1);
              	masu[y][x + 1] = '#';
                mp.add(count + 1);
                q.add(mp);
                mp = null;
            }
          }
          myout(output);
        }
        //Method addition frame start

        //Method addition frame end
}
