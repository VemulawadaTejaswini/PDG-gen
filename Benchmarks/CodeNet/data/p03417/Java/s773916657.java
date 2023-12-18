import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = Long.parseLong(sc.next());
    long b = Long.parseLong(sc.next());
    long s = a*b;
    if(a>1l) s -= b*2;
    if(b>1l) s -= a*2;
    if(a>1l && b>1l) s+=4;
    System.out.println(s);
  }
}
