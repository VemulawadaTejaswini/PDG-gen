import java.util.*;
import java.math.BigInteger;
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    long P = 1000000007;
    BigInteger BP = new BigInteger("1000000007");
    int N = Integer.parseInt(sc.nextLine());
    String[] S = sc.nextLine().split(" ");
    long ans = 0;
    for(int i = 0; i < N; i++){
      BigInteger A = new BigInteger(S[i]);
      for(int j = i+1; j < N; j++){
        BigInteger B = new BigInteger(S[j]);
        BigInteger C = A.xor(B);
        C = C.remainder(BP);
        long D = C.longValue();
        ans += D;
        ans %= P;
      }
    }
    System.out.println(ans);
  }
}