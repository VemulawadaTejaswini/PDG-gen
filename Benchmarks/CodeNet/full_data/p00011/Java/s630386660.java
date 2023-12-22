import java.util.Scanner;
import java.lang.Math;
import java.math.BigDecimal;

public class Main{
	
	public static void main(String[] args){

		Scanner s = new Scanner(System.in);
		s.useDelimiter("[,\\s]*");
		
		int w = s.nextInt();
		int n = s.nextInt();
				
		int[] x = new int[w];
		
		for(int i = 0; i < w; i++){
			x[i] = i;
		}
		
		for(int i = 0; i < n; i++){
			
			int a = s.nextInt()-1;
			int b = s.nextInt()-1;
			
			int tmp = x[a];
			x[a] = x[b];
			x[b] = tmp;
			
		}
		
		for(int i = 0; i < w; i++){
			System.out.println((x[i]+1));
		}
		
	}
	
}
