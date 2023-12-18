import java.util.*;
import java.util.Collections;
 
public class Main{
    public static void main(String[] args){
 
        Scanner sc = new Scanner(System.in);
      
        int k = sc.nextInt();
      
      int a = 12;
      
      if(k <= 12){
        answer = k;
      }
      
      for(int i = 21; a == k; i++){
            List<Integer> list = new ArrayList<>();
while (i > 0) {
    list.add(i % 10);
    i /= 10;
  for(int in = 0;i<list.length; i++ ){
    if(Math.abs(list[i]-list[i+1])>1){
      
    }
  }
            
          }
      
        
}
        
      
   System.out.println(answer);
         
      
    
      
    }
  
 
  
}