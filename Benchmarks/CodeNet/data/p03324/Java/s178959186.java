import java.util.*;
class Main {
        static Scanner sc = new Scanner(System.in);
  		static void myout(Object t){System.out.println(t);}
        static void myerr(Object t){System.err.println(t);}
        static String getStr(){return sc.next();}
        static int getInt(){return sc.nextInt();}
        static Long getLong(){return sc.nextLong();}
        static boolean isNext(){return sc.hasNext();}
        public static void main(String[] args){
          int D = sc.nextInt();
      int N = sc.nextInt();
          if(N == 100){
            N++;
          }
      int output = (int)Math.pow(100,D);
      myout(output * N);
        }
        //便利メソッド追加枠ここから

        //便利メソッド追加枠ここまで
}
