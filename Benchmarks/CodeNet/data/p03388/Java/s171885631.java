import java.util.*;
public class Main {
        static Scanner sc = new Scanner(System.in);
        public static void myout(Object text){System.out.println(text);}
        public static String getStr(){return sc.next();}
        public static int getInt(){return sc.nextInt();}
        public static Long getLong(){return sc.nextLong();}
        public static boolean isNext(){return sc.hasNext();}
        public static void main(String[] args){
                //String tmp = getStr();
                //int tmp = getInt();
                //Long tmp = getLong();
          int Q = getInt();
          while(isNext()){
            Long A = getLong();
            Long B = getLong();
            Long score = A * B - new Long(1);
            double rootScore = Math.sqrt(score);
            int output = (int)rootScore * 2;
            int subtract = 0;//√(A*B-1)が平方数の時-1、A,Bの小さいほう以上なら-1
            if(Math.sqrt(score) > Math.min(A,B)){
              //myout("A:" + A + ",B:" + B + "で通過1");
              subtract++;
              if(Math.min(A,B) == (int)rootScore && (int)rootScore != 1){
            	  //myout("A:" + A + ",B:" + B + "で通過3");
            	  subtract++;
            	}
            }
            if((int)rootScore * (int)rootScore == score){
              //myout("A:" + A + ",B:" + B + "で通過2");
              subtract++;
            }
            
            myout(output - subtract);
          }
        }
        //便利メソッド追加枠ここから

        //便利メソッド追加枠ここまで
}
