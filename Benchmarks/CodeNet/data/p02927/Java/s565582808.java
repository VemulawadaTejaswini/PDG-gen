import java.util.*;
 
public class Main{
 
	public static void main(String[] args){
 
		Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int D = sc.nextInt();
      
        int d = D / 10;
        
        int count = 0; 
        for(int i = 2; i <= d-1; i++){
          for(int j = 2; j <= 9; j++){
            if((i*j <= M)&&(i*j>=4)){
              count++;
           }
          }  
        }
      
         System.out.println(count);
      
    }
}