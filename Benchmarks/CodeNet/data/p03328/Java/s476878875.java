import java.util.*;

public class Main{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    int ans = 1;
    for(int i = 2; ; i++){
      ans += i;
      if(ans > a){
        break;
      }
    }
    
      System.out.println(ans - a);
  }  
}