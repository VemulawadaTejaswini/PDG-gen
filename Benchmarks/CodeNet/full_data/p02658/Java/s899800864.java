import java.util.Scanner;
import java.math.BigInteger;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    BigInteger[] A =new BigInteger[N];
   	BigInteger ans = new BigInteger("1");
    BigInteger V =new BigInteger("1000000000000000000");
    
    
    for (int i = 0; i < N; i++){
      A[i] = sc.nextBigInteger();
      ans = ans.multiply(A[i]);
    }
    
   if ( ans.compareTo(V) > 0 )
     System.out.println("-1");
    else
     System.out.println(ans);
  }
}
