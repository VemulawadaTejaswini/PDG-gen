import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
        int L = in.nextInt();
        int pai = 0;
        int min = 20001;
        int sum = 0;
      
      for(int i = 1;i <= N;i++){
      pai = L + i - 1;
      min = Math.min(min,Math.abs(pai));
      sum += pai;
      }
      
      System.out.print(sum-min);
      
	}
}