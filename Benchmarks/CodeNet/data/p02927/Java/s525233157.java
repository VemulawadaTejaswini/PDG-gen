import java.util.*;
 
public class Main{
 
	public static void main(String[] args){
 
		Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int D = sc.nextInt();
      
        int d = D / 10;
        
        int count = 0; 
        for(int i = 2; i < d; i++){
          for(int j = 2; j <= 9; j++){
            if((i*j <= M)&&(i*j>=4)){
              count++;
           }
          }  
        }
        int d1 = D%10;
        if( d1 != 0){
          for(int k = 2; k <= d1 ; k++){
            if((d*k <= M)&&(d*k>=4)){
              count++;
            }
          }  
        }
      
         System.out.println(count);
      
    }
}