import java.util.*;

public class Main{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    if(n>=1 && n<=10000){
      int ans = n % 1000;
      if(ans != 0){
        ans = 1000 - ans;
        System.out.println(ans);
      }else{
       System.out.println(0);
      }  
    }else{
      System.out.println("入力条件に違反しています");
    }
  }  
}
