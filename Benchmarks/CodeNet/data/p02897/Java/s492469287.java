import java.util.*;
import java.math.BigDecimal;

public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    double odds = 0;
    
    if(num%2 == 0){
      odds = (double) 0.5;
    } else {
      int numHalf = (num/2) + 1;
    odds = (double) numHalf/num;
    }
    System.out.println(odds);
  }
}