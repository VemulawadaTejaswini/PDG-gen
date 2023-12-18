import java.util.*;
import java.util.stream.*;

class Main {
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    var x = scanner.nextInt();
    // var amax = (int) Math.pow( x+0.9, 0.2 );
    var amax = 120;
    for(int a = -amax; a <= amax; a++) {
      var b = fact5(a*a*a*a*a - x);
      if(a*a*a*a*a - x == b*b*b*b*b) {
        System.out.println(a + " " + b);
        System.exit(0);
      }
    }
  }
    
  static int fact5(int x) {
    var sign = x >= 0;
    if(x < 0) x = -x;
    var i = 0;
    while(i*i*i*i*i < x) i++;
    return sign ? i : -i;
  }
}
