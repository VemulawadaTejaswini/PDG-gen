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
		for(int i =0;i<k;i++) {
			p_sum[k-1] += ps[i];
			max = p_sum[k-1];
		}
		for(int i=k; i <n;i++) {
			p_sum[i] = ps[i] + p_sum[i-1] - ps[i-k] ;
			max = Math.max(max, p_sum[i]);
		}
		System.out.println((max+k)/2.0);
		
		
		
		
	}
	


}

 