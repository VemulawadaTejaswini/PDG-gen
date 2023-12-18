import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    String ans = "AGC";
    if(r < 2800) ans = "ARC";
    if(r < 1200) ans = "ABC";
    
    System.out.println(ans);
  }
}