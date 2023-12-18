import java.util.*;
import java.util.stream.*;

class Main {
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    var x = scanner.nextInt();
    var amax = (int) pow( x+0.9, 0.2 );
    for(int a = 1; a <= amax; a++) {
      var b = fact5(x - a*a*a*a*a);
      if(b >= 0) {
        System.out.println(a + " " + (-b));
        System.exit(0);
      }
    }
    var bmax = (int) pow( x/5+0.9, 0.25 );
    for(int b = 1; b <= bmax; b++) {
      var a = fact5(x + b*b*b*b*b);
      if(a >= 0) {
        System.out.println(a + " " + b);
        System.exit(0);
      }
    }
    
  static int fact5(int x) {
    assert x > 0;
    var r = (int) pow(x + 0.9, 0.2);
    if(x > r*r*r*r*r) r = -1;
    return r;
  }
}
