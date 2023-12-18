import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String ans = "Christmas";
    int d = sc.nextInt();
    if(d == 24) ans = "Christmas Eve";
    if(d == 23) ans = "Christmas Eve Eve";
    if(d == 22) ans = "Christmas Eve Eve Eve";
    System.out.println(ans);
  }
}