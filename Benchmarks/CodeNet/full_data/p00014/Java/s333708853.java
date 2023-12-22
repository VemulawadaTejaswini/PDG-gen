import java.util.Scanner;
import java.lang.Math;

class Main {
  public static void main(String[] args){
    Scanner cin = new Scanner(System.in);
    int d;

    while (cin.hasNext()){
      d = cin.nextInt();
      int res = cal_integral(d);
      System.out.println(res);
    }
  }
  
  private static int cal_integral(int d) {
    int base = d, res = 0;
    while (base != 600){
      res += f(base) * d;
      base += d;
    }
    return(res);
  }

  private static int f(int x) {
    return(x * x);
  }
}