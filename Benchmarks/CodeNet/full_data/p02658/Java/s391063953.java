import java.util.*;
 
public class Main{
  
  public static void main(String[] args){
  
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    
    long[] list = new long[num];
    for(int i = 0; i < num ; ++i){
      list[i] = sc.nextLong();
    }
    
    if(num>=2 && num<=(long)Math.pow(10,5)){
    long ans = 1;
    for(int i = 0; i < num; ++i){
      if(list[i] != 0){
       long a = list[i];
       ans = ans * a;
      }else{
        ans = 0;
        break;
      }
    }
    
    if(ans <= (long)Math.pow(10,18)){
      System.out.println(ans);
    }else{
      System.out.println(-1);
    }
    }else{
      System.out.println("入力条件に違反しています");
    }
  }  
}