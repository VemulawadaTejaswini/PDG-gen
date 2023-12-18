import java.util.Scanner;
import java.math.*;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    BigInteger A = new BigInteger(sc.nextLine());
    BigInteger B = new BigInteger(sc.nextLine());
    BigInteger C = A.subtract(B);
    int a = C.signum();
    if(a == 1){
    	System.out.println("GREATER");
    }else if(a == -1){
    	System.out.println("LESS");
    }else if(A.subtract(B).equals(0)){
    	System.out.println("EQUAL");
    }
  }
}