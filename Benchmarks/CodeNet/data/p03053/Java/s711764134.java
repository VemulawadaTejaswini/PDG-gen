import java.util.*;
public class Main {
        static Scanner sc = new Scanner(System.in);
        static void myout(Object t){System.out.println(t);}//standard output
        static void myerr(Object t){System.err.println(t);}//standard error
        static String getStr(){return sc.next();}
        static int getInt(){return Integer.parseInt(getStr());}
        static long getLong(){return Long.parseLong(getStr());}
        static boolean isNext(){return sc.hasNext();}
        static char[] mySplit(String str){return str.toCharArray();}
        public static void main(String[] args){
          char[] a = mySplit("ghtuoghoe");
          int H = getInt();
          int W = getInt();
          char[][] masu = new char[H][W];
          ArrayList<Integer> mp;
          //q内要素が多いと時間かかる
          ArrayDeque<ArrayList<Integer>> q = new ArrayDeque<ArrayList<Integer>>();
          for(int i = 0; i < H; i++){
            masu[i] = mySplit(getStr());
          }
          
          for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
              if(masu[i][j] == '#'){
                //4方のうち、1か所でも.があればqに追加
                if(i != 0 && masu[i - 1][j] == '.' || 
                  j != 0 && masu[i][j - 1] == '.' || 
                  i != H - 1 && masu[i + 1][j] == '.' || 
                  j != W - 1 && masu[i][j + 1] == '.'){
                  mp = new ArrayList<Integer>(10);
                  mp.add(i);
                  mp.add(j);
                  mp.add(0);
                  q.add(mp);
                }
              }
            }
          }
          
          int output = 0;
          
          
          //myerr(q);
          while(q.size() > 0){
            ArrayList<Integer> tmp = q.poll();
            int y = tmp.get(0);
            int x = tmp.get(1);
            int count = tmp.get(2);
            //myerr(y + " " + x);
            output = Math.max(output,count);
            if(y != 0 && masu[y - 1][x] == '.'){
                mp = new ArrayList<Integer>(10);
                mp.add(y - 1);
                mp.add(x);
                masu[y - 1][x] = '#';
                mp.add(count + 1);
                q.add(mp);
            }
            if(x != 0 && masu[y][x - 1] == '.'){
                mp = new ArrayList<Integer>(10);
                mp.add(y);
                mp.add(x - 1);
              	masu[y][x - 1] = '#';
                mp.add(count + 1);
                q.add(mp);
            }
            if(y != H - 1 && masu[y + 1][x] == '.'){
                mp = new ArrayList<Integer>(10);
                mp.add(y + 1);
                mp.add(x);
              	masu[y + 1][x] = '#';
                mp.add(count + 1);
                q.add(mp);
            }
            if(x != W - 1 && masu[y][x + 1] == '.'){
                mp = new ArrayList<Integer>(10);
                mp.add(y);
                mp.add(x + 1);
              	masu[y][x + 1] = '#';
                mp.add(count + 1);
                q.add(mp);
            }
          }
          myout(output);
        }
        //Method addition frame start

        //Method addition frame end
}
