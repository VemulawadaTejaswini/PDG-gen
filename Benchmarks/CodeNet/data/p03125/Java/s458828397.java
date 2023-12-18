import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    in.close();
    int ans = b % a == 0 ? a + b : a - b;
    
    System.out.println(ans);
  }
}