import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long num = sc.nextLong();
    List<Integer> list = new ArrayList<>();
    for ( int i = 0; i < num; i++ ) {
      if ( i % 3 == 0 ) continue;
      if ( i % 5 == 0 ) continue;
      list.add(i);
    }
    var sum = BigInteger.ZERO;
    for ( var n : list ) {
      sum = sum.add(BigInteger.valueOf(n) );
    }
    System.out.println(sum);
  }
}
