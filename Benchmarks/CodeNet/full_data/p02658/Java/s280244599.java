import java.util.*;

public class Main{
  
  public static void main(String[] args){
  
    Scanner sc = new Scanner(System.in);
    long num = sc.nextLong();
    if(num>=2 && num<=100000L){
    long ans = 1;
    for(int i = 0; i < num; ++i){
      long a = sc.nextLong();
      ans = ans * a;
    }
    
    if(ans <= 1000000000000000000L ){
      System.out.println(ans);
    }else{
      System.out.println(-1);
    }
    }else{
      System.out.println("入力条件に違反しています");
    }
  }  
}
