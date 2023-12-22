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
      int r = Integer.parseInt( lines[0] );
      int c = Integer.parseInt( lines[1] );
      int[][] sheet = new int[r+1][c+1]; 
      int sumR = 0;
      int[] sumC = new int[c+1];
      Arrays.fill( sumC, 0 );

      for ( int i = 0; i < sheet.length; i++ ) {
        if ( i != (sheet.length-1) ) lines = br.readLine().split(" ");
        for( int j = 0; j < sheet[i].length; j++) {
          if( i == (sheet.length-1) ) {
            if( j == (sheet[i].length-1)) sheet[i][j] = sumR;
            else {
              sheet[i][j] = sumC[j];
              sumR += sheet[i][j];
            }
          }
          else if( j == (sheet[i].length-1) ) sheet[i][j] = sumR;
          else {
            sumR += (sheet[i][j] = Integer.parseInt(lines[j]));
            sumC[j] += sheet[i][j];
          }
        }
        sumR = 0;
      }

      System.out.println(
        Stream.of(sheet)
              .map( a -> ArrayToString(a) )
              .collect(Collectors.joining("\n"))
      );
    }
  }
  public static String ArrayToString(int[] a) {
      if (a == null)
          return "null";
      int iMax = a.length - 1;
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
