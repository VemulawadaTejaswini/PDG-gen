import java.util.*;
import java.lang.Math;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double num = (double)sc.nextInt();
    double guusuu = Math.floor(num/2);
    Formatter fm = new Formatter();
    System.out.println(fm.format("%.10f", (guusuu / num > 0)?guusuu/num:0));
  }
}