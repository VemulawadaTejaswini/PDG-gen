import java.util.Scanner;
import java.math.BigInteger;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 0; i < n; i++) {
      BigInteger bi = sc.nextBigInteger().add(sc.nextBigInteger());
      System.out.println(bi.toString().length() > 80 ? "overflow" : bi.toString());
    }
  }
}