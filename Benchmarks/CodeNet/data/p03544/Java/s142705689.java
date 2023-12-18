import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
      	long memo[] = new long [n+1];
      	memo[0] = 2;memo[1]=1;
      
      for(int i =2;i <= n ;i++){
        memo[i] = memo[i-1]+memo[i-2];
      }
      System.out.print(memo[n]);
	}
}