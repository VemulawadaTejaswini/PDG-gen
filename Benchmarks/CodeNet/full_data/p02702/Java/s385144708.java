import java.util.*;
import java.math.BigInteger;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    int n = s.length();
    long ans = 0;

    for(int i = 0; i < n; i++){
      for(int j = n; j > i; j--){
        BigInteger b = new BigInteger(s.substring(i, j));
        BigInteger t = new BigInteger("2019");
        if(b.remainder(t).equals(0)){
          ans += 1;
        }
      }
    }

    System.out.println(ans);
  }
}
