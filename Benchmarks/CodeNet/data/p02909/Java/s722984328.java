import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String su = "Sunny";
    String cl = "Cloudy";
    String ra = "Rainy";
    if(s.equals(su)) {
      System.out.println(cl);
    } else if(s.equals(cl)) {
      System.out.println(ra);
    } else {
      System.out.println(su);
    }
  }
}