import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    long n = sc.nextLong();
    long tmp = 1;
    String ans = "";

    while (true) {
      if ((n-tmp) % (tmp*(-2)) == 0) {
        ans += "1";
        n -= tmp;
        if (n == 0) break;
      } else {
        ans += "0";
      }

      tmp *= -2;
    }

    StringBuffer sb = new StringBuffer(ans);
		String dst = sb.reverse().toString();
		System.out.println(""+dst);
  }
}
