import java.util.*;

public class Main {
    
  private static long dfs(String input,long sum,int index){
      if(index >= input.length()){
          return sum;
      }
      long total = 0;
      
      for(int i = index + 1;i <= input.length();i++){
          total += dfs(input,sum + Long.parseLong(input.substring(index,i)),i);
      }   
      
      return total;
  }
        
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String input = sc.next();    
    System.out.println(dfs(input,0,0));
  }  
    
}
