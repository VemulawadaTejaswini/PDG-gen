import java.util.*;

public class Main{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int ans = 0;
    int[] list = new int[n];
    for(int i=0; i < n ; ++i){
      list[i] = sc.nextInt();
      ans += list[i];
    }
    
    int intMin = list[0];
    for(int i=1; i < n ; ++i){
     if(intMin >= list[i]){
       intMin = list[i];
     }
              
    }   
     System.out.println(ans - intMin);
  }
  
}