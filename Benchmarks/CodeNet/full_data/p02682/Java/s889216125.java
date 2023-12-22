import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int k = sc.nextInt();
    
    int ans = 0;
    ans += Math.min(a,k);
    k -= a;
    k -= b;
    if(k > 0){
      ans -= Math.min(c,k);
    }
    System.out.println(ans);
  }
}