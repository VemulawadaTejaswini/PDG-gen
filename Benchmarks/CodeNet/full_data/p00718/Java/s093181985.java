import java.util.Arrays;
import java.util.Scanner;

public class Main {
  Scanner sc;

  int mcxi(char c) {
    switch ( c ) {
    case 'm':
      return 1000;
    case 'c':
      return 100;
    case 'x':
      return 10;
    case 'i':
      return 1;
    }
    return c - '0';
  }

  boolean isMCXI(char c) {
    switch ( c ) {
    case 'm':
    case 'c':
    case 'x':
    case 'i':
      return true;
    }

    return false;
  }

  int MCXItoInt(String s) {
    int sum = 0;
    int v = 1;
    for ( char c : s.toCharArray() ) {
      if ( isMCXI( c ) ) {
        sum += v * mcxi( c );
        v = 1;
      } else {
        v = mcxi( c );
      }
    }

    return sum;
  }

  String I2MCXI(int v) {
    String str = "";
    if ( v / 1000 > 0 ) {
      int v_ = v / 1000;
      if ( v_ > 1 ) {
        str += v_;
      }
      str += 'm';

      v -= v_ * 1000;
    }
    if ( v / 100 > 0 ) {
      int v_ = v / 100;
      if ( v_ > 1 ) {
        str += v_;
      }
      str += 'c';

      v -= v_ * 100;
    }
    if ( v / 10 > 0 ) {
      int v_ = v / 10;
      if ( v_ > 1 ) {
        str += v_;
      }
      str += 'x';

      v -= v_ * 10;
    }
    if ( v > 0 ) {
      int v_ = v;
      if ( v_ > 1 ) {
        str += v_;
      }
      str += 'i';
    }

    return str;
  }

  void run() {
    int n = ni();
    for ( int i = 0; i < n; ++i ) {
      String a = sc.next();
      String b = sc.next();

      int v = MCXItoInt( a ) + MCXItoInt( b );

      System.out.println( I2MCXI( v ) );
    }
  }

  Main() {
    sc = new Scanner( System.in );
  }

  int ni() {
    return sc.nextInt();
  }

  public static void main(String[] args) {
    new Main().run();
  }

  void debug(Object... os) {
    System.err.println( Arrays.deepToString( os ) );
  }
}