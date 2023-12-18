import java.util.*;

public class Main{
  public static void main(String[] args){
    
    Scanner sn = new Scanner(System.in);
    
    int a = sn.nextInt();
    int b = sn.nextInt();
    int x = sn.nextInt();
    int ans = 0;
    
    for(int i = a; i <= b; i++){
      int calc = i % x;
      if(calc == 0){
        ans += 1;
      }
    }
    
    System.out.println(ans);
    
  }
}