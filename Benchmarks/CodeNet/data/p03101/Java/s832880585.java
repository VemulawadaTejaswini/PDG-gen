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


    System.out.println(getAns());





  }

  static public int getAns(){
    Scanner scanner = new Scanner(System.in);
    int H = scanner.nextInt();
    int W = scanner.nextInt();

    int h = scanner.nextInt();
    int w = scanner.nextInt();




    return (H - h) * (W - w);
  }

}
