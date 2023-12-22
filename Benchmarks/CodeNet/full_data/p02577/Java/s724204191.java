import java.util.*;
import java.math.*;;

public class Main{
  static boolean mult9(BigInteger num){
  	if (num.compareTo(new BigInteger("0")) == 0 || num.compareTo(new BigInteger("9")) == 0)
      return true;
    if (num.compareTo(new BigInteger("0")) == -1)
      return false;
   
    return mult9(num.shiftRight(3).subtract(num.and(new BigInteger("7"))));
  }
  public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	BigInteger num = sc.nextBigInteger();
    	if (mult9(num))
          System.out.println("Yes");
    	else
          System.out.println("No");
    }
}