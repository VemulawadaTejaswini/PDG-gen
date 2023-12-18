import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s =sc.next();
    System.out.println(solve(s));
  }

  private static int solve(String s) {
    int ret = 0;
    for(char c: s.toCharArray()) {
      if(c=='A') ret++;
      if(c=='C') ret++;
      if(c=='G') ret++;
      if(c=='T') ret++;
    }
    return ret;
  }
}
