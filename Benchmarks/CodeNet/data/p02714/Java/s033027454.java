import java.util.*;

public class Main {
  public static void main(String[] args) {
    var sc = new Scanner(System.in);
    int length = sc.nextInt();
    char[] array = sc.next().toCharArray();
    long[] rgb = new long[3];   // r -> 0, g -> 1, b -> 2

    for ( int i = 0; i < array.length; i++ ) {
      switch ( array[i] ) {
        case 'R':
          rgb[0]++;
          break;
        case 'G':
          rgb[1]++;
          break;
        case 'B':
          rgb[2]++;
          break;
      }
    }

    long sum = rgb[0] * rgb[1] * rgb[2];
    for ( int i = 0; i < length - 2; i++ ) {
      for ( int j = i + 1; j < length - 1; j++ ) {
        final int k = (j << 1) - i;
        if ( k >= length ) break;
        var con1 = array[i] != array[j];
        var con2 = array[i] != array[k];
        var con3 = array[j] != array[k];
        if ( con1 && con2 && con3 ) sum--;
      }
    }
    System.out.println(sum);
  }
}
