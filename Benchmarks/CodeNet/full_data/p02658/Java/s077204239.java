import java.util.*;
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    
    long ans = 1;
    
    long max = 1000000000000000000L;
    
    for(int i = 0; i < n; i++){
      long l = sc.nextLong();
      ans = ans*l;
      if (ans == 0){
        break;
      }
    }
    
    if (ans > max || ans < 0){
      ans = -1;
    }
    
    System.out.println(ans);
  }
}