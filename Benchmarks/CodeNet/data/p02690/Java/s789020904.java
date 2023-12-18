import java.util.*;
import java.util.stream.*;

class Main {
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    var x = scanner.nextInt();
    // var amax = (int) Math.pow( x+0.9, 0.2 );
    var amax = 120;
    for(int a = -amax; a <= amax; a++) {
      var b5 = a*a*a*a*a - x;
      if(b5 < 0) {
        var b = -fact5(-b5);
        if(b < 0) {
          System.out.println(a + " " + b);
          System.exit(0);
        }
      } else {
        var b = fact5(b5);
        if(b >= 0) {
          System.out.println(a + " " + b);
          System.exit(0);
        }
      }
    }
  }
    
  static int fact5(int x) {
    assert x >= 0;
    var r = (int) Math.pow(x + 0.9, 0.2);
    if(x != r*r*r*r*r) r = -1;
    return r;
  }
}
