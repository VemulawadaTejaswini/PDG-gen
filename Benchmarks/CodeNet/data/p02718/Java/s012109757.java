import java.util.*;
import java.util.Collections;
 
public class Main{
    public static void main(String[] args){
 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
      
        Integer a[];
        a = new Integer[n];
      
        Integer sum = 0;
      
        for(int i = 0; i < n; i++){
            
            a[i] = sc.nextInt();
          sum += a[i]; 
          
        }
      
      Arrays.sort(a, Collections.reverseOrder());
      
      if(a[m-1]>=sum/(4*m)){
         System.out.println("Yes");
      } else {
         System.out.println("No");
      }
      
        
      
        
      
      
      
    }
}