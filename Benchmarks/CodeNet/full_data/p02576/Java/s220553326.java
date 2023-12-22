import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int t = sc.nextInt();
    int ans;
    if( n <= x ){
      ans = t;
    } else {
      int tmp = n / x;
      ans = t * (tmp + 1);
    }
    System.out.println(ans);
  }
}