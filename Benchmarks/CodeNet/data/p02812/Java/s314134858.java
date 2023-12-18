import java.util.*;
public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    String[] array = S.split("ABC");
    int ans = 0;
    if (S.contains("ABC")) 
    	ans = 1;

    System.out.println(Math.max(array.length-1,ans));
  }
}