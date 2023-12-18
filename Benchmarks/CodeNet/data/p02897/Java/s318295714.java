import java.util.*;
import java.lang.Math;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double num = (double)sc.nextInt();
    double guusuu = Math.floor(num/2);
    double sum = (guusuu / num > 0)?guusuu/num:0;
    
    System.out.println(sum);
  }
}