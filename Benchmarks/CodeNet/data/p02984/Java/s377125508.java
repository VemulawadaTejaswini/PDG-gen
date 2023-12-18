import java.util.*;
import java.math.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    BigInteger A[] = new BigInteger[N];
    BigInteger B[] = new BigInteger[N];
    BigInteger two = new BigInteger("2");
 
    for (int i=0; i<=N-1; i++) {
      A[i] = sc.nextBigInteger();
    }
    BigInteger all = new BigInteger("0");
    BigInteger all_a1 = new BigInteger("0");
 
    for(int i=0; i<=N-1; i++){
      all = all.add(A[i]);
    }
    all = all.divide(two);
 
    for(int i=0; i<=N-1; i+=2){
      all_a1 = all_a1.add(A[i]);
    }
 
     B[0] = all_a1.subtract(all);
    for(int i=1; i<=N-1; i++){
      B[i] = A[i-1].subtract(B[i-1]);
    }
 
    for(int i=0; i<=N-1; i++){
      System.out.print(B[i].multiply(two)+" ");
    }
    System.out.println();
  }
}