import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
 
public class Main {

  public static void main(String[] args) throws IOException {
    try ( BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ) {

      String[] lines = br.readLine().split(" ");
      int n = Integer.parseInt(lines[0]);
      int m = Integer.parseInt(lines[1]);
      int l = Integer.parseInt(lines[2]);
      long[][] mA = new long[n][m];
      long[][] mB = new long[m][l];
      long[][] mC = new long[n][l];

      for(int i = 0; i < n; i++ ) {
        lines = br.readLine().split(" ");
        mA[i] = Stream.of(lines)
                      .mapToLong(Long::parseLong)
                      .toArray();
      }
      for( int i = 0; i < m; i++ ) {
        lines = br.readLine().split(" ");
        mB[i] = Stream.of(lines)
                      .mapToLong(Long::parseLong)
                      .toArray();
      }

      for( int i = 0; i < n; i++ ) {
        for( int j = 0; j < l; j++ ){
          for( int k = 0; k < m; k++ )
          mC[i][j] += mA[i][k] * mB[k][j];
        }
      }

      System.out.println(
        Stream.of(mC)
              .map( a -> Stream.of(a)
                      .collect(Collectors.mapping(b -> ArrayToString(b),
                            Collectors.joining())) )
              .collect(Collectors.joining("\n"))
      );
      System.out.println(
        Stream.of(mC)
              .map( a -> ArrayToString(a) )
              .collect(Collectors.joining("\n"))
      );
    }
  }
  public static String ArrayToString(long[] a) {
      if (a == null)
          return "null";
      long iMax = a.length - 1;
      if (iMax == -1)
          return "[]";

      StringBuilder b = new StringBuilder();
      for (int i = 0; ; i++) {
          b.append(a[i]);
          if (i == iMax)
              return b.toString();
          b.append(" ");
      }
  }
}
