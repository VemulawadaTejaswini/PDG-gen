import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    List<Integer> list = new ArrayList<>();
    for ( int i = 0; i < num; i++ ) {
      if ( i % 3 == 0 ) continue;
      if ( i % 5 == 0 ) continue;
      if ( i % 15 == 0 ) continue;
      list.add(i);
    }
    long sum = 0L;
    for ( var n : list ) {
      sum += n;
    }
    System.out.println(sum);
  }
}
