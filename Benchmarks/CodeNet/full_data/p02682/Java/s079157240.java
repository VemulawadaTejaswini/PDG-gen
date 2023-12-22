import java.lang.System.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Int a = sc.nextInt();
    Int b = sc.nextInt();
    Int c = sc.nextInt();
    Int k = sc.nextInt();


    if (a>k) {
      out.println(k);
    } else if (a+b>k) {
      out.println(a);
    } else {
      out.println(a-(k-a-b));
    }
  }
}

