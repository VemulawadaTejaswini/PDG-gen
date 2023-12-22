import java.util.*;

public class Main{
	public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int m = sc.nextInt();
      long k = sc.nextLong();
      
      long ab[] = new long[n+m];
      
      for(int i = 0; i < n; i++){
        ab[i] = sc.nextLong();
      }
      
      for(int i = n; i < n+m; i++){
        ab[i] = sc.nextLong();
      }
      
      Arrays.sort(ab);
      
      int result = 0;
      for(int i = 0; i < n+m; i++){
      	k -= ab[i];
        if(k < 0l){
          break;
        }
        result++;
      }
      
      System.out.print(result);
    }
}
