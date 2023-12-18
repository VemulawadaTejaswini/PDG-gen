import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    int ans = 0;
    while(a < b){
      a += a-1;
      ans++;
    }
    System.out.println(ans);
  }
}