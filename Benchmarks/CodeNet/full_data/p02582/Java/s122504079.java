import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int ans = 1;
    switch (s) {
      case "RRR":
        ans = 3;
        break;
      case "RRS":
      case "SRR":
        ans = 2;
        break;
      case "SSS":
        ans = 0;
        break;
    }
    System.out.println(ans);
  }
}