import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Santa.
 */
public class Main {

  static int N;
  static int K;
  static long Q;
  static int A;
  static int B;
  static long C;
  static double min = 9999999;
  static long ans = 0;




  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String s = scanner.next();
    int N = s.length();
//    System.out.println(N);

      int oldlen = 999999;


      while(true){

      int i = 0;
      while(s.length() > i + 1){
        if(s.charAt(i) != s.charAt(i + 1)){
          s = getS(s, i);

//          System.out.println(s);

        }
        i++;
      }
        if(s.length() == oldlen)break;
        oldlen = s.length();

    }


    System.out.println(N - s.length());

  }

  static public String getS(String s, int i){
//    System.out.println("i = " + i);
    if(s.length() > i + 2){
      return s.substring(0, Math.max(i , 0)) + s.substring(Math.min(s.length(),i + 2), s.length());
    }

    if(s.length() == 2)return "";


    return s.substring(0,i);

  }
}
