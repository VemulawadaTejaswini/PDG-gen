import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int d = sc.nextInt();
    int w = 2*d+1;
    int ans = (n+(w-1))/w;
    System.out.println(ans);
  }
}
