import java.util.Scanner;
import java.math.BigInteger;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    BigInteger bf = BigInteger.valueOf(1);
    for (int i = 1; i < n+1; i++) {
      bf = bf.multiply(BigInteger.valueOf(i));
    }
    System.out.println(bf.toString());
  }
}