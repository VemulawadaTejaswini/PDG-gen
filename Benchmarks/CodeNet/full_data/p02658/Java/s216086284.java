import java.util.Scanner;
import java.util.Comparator;
import java.math.BigInteger;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    BigInteger A[] = new BigInteger[N];
    BigInteger big = new BigInteger("1000000000000000000");
    BigInteger result = BigInteger.ONE;
    for (int i = 0;i < N;i++) {
      A[i] = scan.nextBigInteger();
      result = result.multiply(A[i]);
      if (result.compareTo(big) > 0) {
        System.out.println(-1);
        return;
      }
    }
    System.out.println(result);
  }
}
