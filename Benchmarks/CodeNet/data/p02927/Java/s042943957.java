import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int D = sc.nextInt();
      
      int count = 0; 
      for(int k = 4 ; k <= M ; k++){
        for(int i = 22; i <= D; i++){
            int d1 = i % 10;
            int d10 = i / 10;
            if(d1 * d10  == k){
              count++;
           } 
        }
      }
      
         System.out.println(count);
      
    }
}