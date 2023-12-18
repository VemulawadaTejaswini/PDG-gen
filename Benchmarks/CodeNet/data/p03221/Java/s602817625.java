import java.util.*;
public class Main {
        static Scanner sc = new Scanner(System.in);
        static void myout(Object t){System.out.println(t);}//standard output
        static void myerr(Object t){System.err.println(t);}//standard error
        static String getStr(){return sc.next();}
        static int getInt(){return sc.nextInt();}
        static long getLong(){return Long.parseLong(getStr());}
        static boolean isNext(){return sc.hasNext();}
        static String[] mySplit(String str){return str.split("");}
        public static void main(String[] args){
          int N = getInt();
          int M = getInt();
          PriorityQueue<Integer>[] qlist = new PriorityQueue[N];
          HashMap<Integer,Integer> noMap = new HashMap<Integer,Integer>(M);
          ArrayList<String> outlist = new ArrayList<String>(M);
          for(int i = 0; i < N;i++){
            qlist[i] = new PriorityQueue<Integer>();
          }
          for(int i = 0; i < M;i++){
            int p = getInt()-1;
            int y = getInt();
            qlist[p].add(y);
            noMap.put(y,i);
            outlist.add("");
          }
          
          for(int i = 0; i < N;i++){
            int count = 1;
            while(qlist[i].size() > 0){
              int getY = qlist[i].poll();
              int addNo = noMap.get(getY);
              String addString = String.format("%06d",i+1) + String.format("%06d",count);
              outlist.set(addNo,addString);
              count++;
            }
          }
          for(int i = 0; i < M;i++){
            myout(outlist.get(i));
          }
        }
        //便利メソッド追加枠ここから

        //便利メソッド追加枠ここまで
}
