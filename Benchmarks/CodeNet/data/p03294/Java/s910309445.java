import java.math.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    br.readLine();
    String str[] = br.readLine().split(" ");
    
    BigInteger d[] = new BigInteger[str.length];
    BigInteger v = BigInteger.ONE;
    
    for(int i = 0; i < str.length; i++) {
      d[i] = new BigInteger(str[i]);
      v = v.multiply(d[i]);
    }
    v = v.subtract(BigInteger.ONE);
    
    BigInteger t = BigInteger.ZERO;
    for(int i = 0; i < str.length; i++) {
      t = t.add(v.remainder(d[i]));
    }
    
    System.out.println(t);
  }
}
