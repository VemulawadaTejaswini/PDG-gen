import java.util.*;

public class Main{
  public static void main(String aargs[]){
    Scanner sc = new Scanner(System.in);
    
    int ans = sc.nextInt() % 1000;
    
    ans = (ans == 0) ? 0 : 1000 - ans;
    
    System.out.println(ans);
  }
}