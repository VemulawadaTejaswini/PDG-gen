import java.util.*;
import java.math.*;

class Main{       
   public static void main(String[] args){

     Scanner sc = new Scanner(System.in);  
      
     int color[] = {0,0,0,0,0,0,0,0};
     
   int N = sc.nextInt();
   int overcolor = 0;     
     
   for(int i = 0;i < N;i++){       
     int x = sc.nextInt();
     for(int j = 0;j <= 7;j++){
         if(400*j<= x && x < 400*(j+1)){
             color[j]++;
         }        
     }
     if(x >= 3200){
         overcolor++;
     }
   }
     
     int sum = 0;
     for(int i = 0;i < 8;i++){
         if(color[i] > 0){
             sum++;
         }
     }     
     
     if(sum == 0){
         int min = 1;
         int max = overcolor;
         System.out.println(min + " " + max);
         return;
     }
     
     if(sum > 0){
         int min = sum;
         int max = sum + overcolor;
         System.out.println(min + " " + max);
         return;
     }
     
          
      
   }
}
        
        