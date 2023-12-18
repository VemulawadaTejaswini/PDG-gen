import java.util.*;

public class Main{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int x = Integer.parseInt(sc.next());
    
    int[] list = new int[N];
    int max = 0;
    for(int i = 0 ; i < N ; i++){
      list[i] = Integer.parseInt(sc.next());
      max += list[i];
    }
    System.out.println(max);
    
    
   
    int count = 0;
    for(int i = 0 ; i < N ; i++){
      int candy = list[i];
      if(x - candy >= 0){
        count++;
        x -= candy;
      }
    }
    
    if((max > x) && (max != x)){
       count -= 1;
       System.out.println(count);  
    }else{
      System.out.println(count);
    }
  }  
}