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
          PriorityQueue<Integer> pq = new PriorityQueue<>();
          HashMap<Integer,Integer> hm = new HashMap<>();
          int output = N;
          for(int i = 0; i < N; i++){
            int pos = getInt();
            pq.add(pos);
            hm.put(pos,getInt());
          }
          int used = 0;
          for(int i = 0; i < N; i++){
    		int pos = pq.poll();
            int len = hm.get(pos);
    if(i == 0){
       used = pos+len;
    }else{
      if(used <= pos-len){
         used = pos+len;
      }else{
       output--; 
      }
    }
  }
  myout(output);
        }
        //便利メソッド追加枠ここから

        //便利メソッド追加枠ここまで
}
