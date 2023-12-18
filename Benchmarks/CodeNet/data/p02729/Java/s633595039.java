import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    n = n * (n-1) / 2;
    m = m * (m-1) / 2;
    int ans = 0;
    ans = n + m;
    System.out.println(ans);
  }
}
