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

    int N = scanner.nextInt();


    scanner.nextLine();

    String s = scanner.nextLine();

    boolean flag = false;
    int ans = 0;
    for (int i = 0; i < N; i++) {

      if(flag == true) {
        if(s.charAt(i) == '#'){

        }else{
          ans++;
        }
      }else{
        if(s.charAt(i) == '#'){
          flag = true;
        }
      }
    }

    System.out.println(ans);
  }
}

