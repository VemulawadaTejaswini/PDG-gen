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
          int N = getInt();
          int H = getInt();
          int W = getInt();
          PriorityQueue[] HQlist = new PriorityQueue[H];
          PriorityQueue[] WQlist = new PriorityQueue[W];
          Map<String,Integer> Wtokutei = new HashMap<String,Integer>();//行と値があれば列がわかる
          Map<String,Integer> Htokutei = new HashMap<String,Integer>();//列と値があれば行がわかる
          long output = 0;
          for(int i = 0; i < N; i++){
            int r = getInt()-1;
            int c = getInt()-1;
            int Ai = getInt();
            Wtokutei.put(String.valueOf(r)+":"+String.valueOf(Ai),c);
            Htokutei.put(String.valueOf(c)+":"+String.valueOf(Ai),r);
            if(HQlist[r] == null){
              HQlist[r] = new PriorityQueue(Comparator.reverseOrder());
            }
            if(WQlist[c] == null){
              WQlist[c] = new PriorityQueue(Comparator.reverseOrder());
            }
            HQlist[r].add(Ai);
            WQlist[c].add(Ai);
          }
          int add = 0;
          int tmpC = 0;
          for(int i = 0; i < H; i++){
            if(HQlist[i] != null){
              PriorityQueue<Integer> tmpQueue = new PriorityQueue<Integer>();
              while(HQlist[i].size() != 0){
                add = (int)HQlist[i].poll();
                tmpC = (int)Wtokutei.get(String.valueOf(i)+":"+String.valueOf(add));
                //列を見たときに要素数が1個の場合は列巡回時に取ればいい
                //行で次の優先値をとった方がいい
                if(WQlist[tmpC].size() == 1 && HQlist[i].size() != 0){
                  tmpQueue.add(add);
                }else{
                  for(int j = 0; j < tmpQueue.size(); j++){
                    HQlist[i].add(tmpQueue.poll());
                  }
                  break;
                }
              }
              
              WQlist[tmpC].remove(add);
              output += add;
              /*WQlistからtmpと同じ値を持つ要素を見つける必要がある*/
              myerr("値:" + add + ",行:" + (i+1) + ",列:" + (tmpC+1));
            }
          }
          for(int i = 0; i < W; i++){
            if(WQlist[i] != null && WQlist[i].size() != 0){
              add = (int)WQlist[i].poll();
              int tmpR = Htokutei.get(String.valueOf(i)+":"+String.valueOf(add));
              WQlist[tmpR].remove(add);
              output += add;
              /*WQlistからtmpと同じ値を持つ要素を見つける必要がある*/
              myerr("値:" + add + ",行:" + (i+1) + ",列:" + (tmpR+1));
            }
          }
          myout(output);
        }
        //便利メソッド追加枠ここから

        //便利メソッド追加枠ここまで
}
