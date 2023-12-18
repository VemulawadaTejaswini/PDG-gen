import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String ans = "ABC";
    if(n >= 1000) ans = "ABD";
    System.out.println(ans);
  }
}