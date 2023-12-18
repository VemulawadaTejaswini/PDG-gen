import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();

    long count = 0;

    for (int i = 0; i < s.length()-3; i++) {
      for (int j = i+4; j < s.length()+1; j++) {
        String k = s.substring(i,j);
        long n = Long.valueOf(k);
        if (n%2019 == 0) {
          count++;
        }
      }
    }

    System.out.println(count);

  }

}
