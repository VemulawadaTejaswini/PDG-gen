import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * https://qiita.com/drken/items/fd4e5e3630d0f5859067
 * @author YukihiroLocal
 *
 */
public class Main {
  public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    // get a integer

    int N = sc.nextInt();
//    System.out.println(" integer is " + N);
    List<Integer> aList = new ArrayList<>();
    List<Integer> divideList = new ArrayList<>();
    int Y = sc.nextInt();
    int ansx = -1, ansy = -1, ansz = -1;
//    Y = 10000 * x + 5000 * y + 1000 *z;
//    N = x + y + z;
//    z = N - x - y;
//    z = (Y - (10000 * x + 5000 * y)) /1000;


    for(int x = 0; x <= N ; x++){
      // i is equal to x
      double caluculatedY = getCalY(x, N,  Y);
      double caluculatedZ = N -x - caluculatedY;
      if(validateAll(caluculatedY,caluculatedZ, N)){
        ansx = x;
        ansy = (int)caluculatedY;
        ansz = (int)caluculatedZ;
        break;
      }
    }
    System.out.println(ansx + " " + ansy + " " + ansz);

  };
  private static double getCalY(int x,int N, int Y) {
//    Y = 10000 * x + 5000 * y + 1000 * (N - x - y);
//    Y = 10000 * x + 5000 * y + 1000 *N - 1000* x - 1000* y;
//    Y = 9000*x + 4000*y + 1000*N
//
    double y = ((double)Y - 9000 * (double)x  - 1000* (double)N ) /4000;
    return y;
  }

  public static boolean validate(double a, double N) {
    if(a ==(int)a && a >= 0 && a <= N){
      return true;
    }else{
      return false;
    }
  }
  public static boolean validateAll(double y, double z, int N) {
    boolean yflag = false, zflag = false;
    if(validate(y, N)){
      yflag = true;
    };
    if(validate(z, N)){
      zflag = true;
    }
    return yflag && zflag;
  }
}
