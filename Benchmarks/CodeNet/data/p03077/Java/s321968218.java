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
    long N = scanner.nextLong();
    long[] map = new long[5];

//    int A = scanner.nextInt();
//    int B = scanner.nextInt();
//    int C = scanner.nextInt();
//    int D = scanner.nextInt();
//    int E = scanner.nextInt();

    long min = 99999999999999999L;
    for (int i = 0; i < 5; i++) {

      map[i] = scanner.nextLong();
      if(min > map[i])min = map[i];
    }

    if(min > N){
      System.out.println(5);
    }else{
      System.out.println((N + min - 1)/min + 4);
    }




  }


}
