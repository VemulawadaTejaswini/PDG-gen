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
  static long B;
  static long C;
  static double min = 9999999;
  static long ans = 0;




  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String s = scanner.nextLine();

    boolean ans = retAns(s);

    if(ans){
        System.out.println("Heisei");
      }else{
        System.out.println("TBD");
    }


  }

  public static boolean retAns(String s){


    String[] h = s.split("/");

    if(Integer.parseInt(h[0]) <= 2018) return true;

    if(Integer.parseInt(h[1])  <= 4) return true;


    return false;
  }


}
