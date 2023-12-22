import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      final int numMax = 999_999;
      String line;
      int num;
      int result;

      int[] prime = new int[100_000];
      prime[0] = 2;
      for ( int i=3, j=1; i != numMax; i+=2 ) {
        if( isPrime(i,prime) ) {
          prime[j++] = i;
        }
      }

      while(true) {

        if( ((line = br.readLine()) == null) || line.isEmpty() ) break;

        num = Integer.parseInt(line);
        if( num == 0 || num == 1) {
          result = 0;
          System.out.println(result);
          continue;
        }
        
        result = 1;
        for ( int i = 3; i <= num; i+=2 ) {
          if( isPrime(i,prime) ) {
            result += 1;
          }
        }
        System.out.println(result);
      }
    }
  }

  public static boolean isPrime(int num,int[] prime) {
    int k = Double.valueOf( Math.sqrt(num) ).intValue();
    for(int i: prime) {
      if ( num % i == 0 ) return false;
      if ( i > k ) return true;
    }
    return true;
  }
}
