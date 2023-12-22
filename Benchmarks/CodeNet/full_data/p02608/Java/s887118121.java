import java.util.*;
 
public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      
      for(int i = 1; i <= N;i++){
        int count = 0;
        for(int x = 1; x < i-1;x++){
          for(int y =1; < i-x; y++){
            for(int z = 1; z < i-x-y; z++){
              if( x+y+z == i){
                count++;
                break;
              }
            }
          }
        }
        System.out.println(count);
      }
    }
}