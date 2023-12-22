import java.util.Scanner;
import java.math.BigInteger;  
 
public class Main {
 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BigInteger x = sc.nextBigInteger();
    
    long sum = 0;
    while (x) {
      sum = sum + x%10;
      x = x / 10;
    }
   
    if (sum % 9 == 0) {
      System.out.println("Yes");
    }
    else {
      System.out.println("No");
    }
}