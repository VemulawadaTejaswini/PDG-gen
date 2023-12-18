import java.util.*;
public class Main {

	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
			
		
		
		int n = sc.nextInt();
		
		int k = sc.nextInt();
		
		int[] ps = new int[n];
		
		for(int i=0; i< n; i++) {
			ps[i] = sc.nextInt();
		}
		
		
		int[] p_sum = new int[n];
		int max = 0;
		for(int i=0; i + k - 1 <n;i++) {
			int t = 0;
			for(int j=i;j<= i+k - 1;j++) {
				t += ps[j]; 
			}
			p_sum[i] = t;
			max = Math.max(max, p_sum[i]);
		}
		System.out.println((max+k)/2.0);
		
		
		
		
	}
	


}

 