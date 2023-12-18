import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    int n = Integer.parseInt(a+b);
    int i = 1;
    while (i*i < n) {
      i++;
    }
    
    System.out.println(i*i == n ? "Yes" : "No");
  }
}