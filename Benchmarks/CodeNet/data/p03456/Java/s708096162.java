import java.util.Scanner;
import java.lang.Math;
import java.math.BigDecimal;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    String c = a + b;
    int num = Integer.parseInt(c);
    double k = Math.sqrt(num);
    BigDecimal bd = new BigDecimal(k);
    BigDecimal bd3 = bd.setScale(0, BigDecimal.ROUND_DOWN); 
    double x = bd3.doubleValue();
    if(k == x){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}