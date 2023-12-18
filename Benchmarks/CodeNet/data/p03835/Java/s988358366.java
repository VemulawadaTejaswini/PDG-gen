import java.util.*;
public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int K = sc.nextInt();
      int S = sc.nextInt();
            
      int count = 0;
      
      for(int x=0; x<=K; x++){
        for(int y=0; y<=K-x; y++){
          for(int z=0; z<=K-x-y; z++){
            if(x+y+z==S){
             count ++; 
            }
          }
        }
      }
            
      System.out.println(count);
    }  
} 