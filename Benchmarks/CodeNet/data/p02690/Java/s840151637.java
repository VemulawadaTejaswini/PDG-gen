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
        static String toKaigyo(String[] list){return String.join("\n",list);}
        static String toHanSp(String[] list){return String.join(" ",list);}
        public static void main(String[] args){
          int X = getInt();
          ArrayList<Long> list = new ArrayList<Long>();
          list.add(new Long(0));
          for(int i = 1; i < 120; i++){
            list.add((long)Math.pow(i,5));
            list.add(-1 * (long)Math.pow(i,5));
          }
          for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.size(); j++){
              long mae = list.get(i);
              long ato = list.get(j);
              if(mae - ato == X){
                boolean isMinus1 = false;
                boolean isMinus2 = false;
                int outputMae;
                int outputAto;
                if(mae < 0){
                  isMinus1 = true;
                  mae *= -1;
                }
                outputMae = (int)Math.pow(mae, 0.2);
                if(ato < 0){
                  isMinus2 = true;
                  ato *= -1;
                }
                outputAto = (int)Math.pow(ato, 0.2);
                if(isMinus1){
                  outputMae *= -1;
                }
                if(isMinus2){
                  outputAto *= -1;
                }
                myout(outputMae + " " + outputAto);
                return;
              }
            }
          }
        }
        //Method addition frame start

        //Method addition frame end
}
