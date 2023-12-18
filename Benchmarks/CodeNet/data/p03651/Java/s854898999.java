import java.io.*;
import java.util.*;
import java.math.*;


class Main{

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    Integer[] nk = Arrays.stream(in.readLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
    BigInteger[] values = Arrays.stream(in.readLine().split(" ")).map(s -> new BigInteger(s)).toArray(BigInteger[]::new);
    BigInteger v = values[0];
    for(int j=1;j<nk[0];j++){
      v = v.gcd(values[j]);
    }
    if((v).equals(BigInteger.ONE)){
      System.out.println("POSSIBLE");
      return;
    }

    System.out.println("IMPOSSIBLE");
    return;
  }
}
