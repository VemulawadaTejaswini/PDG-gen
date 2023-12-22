import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] R = new int[n];
		
		for(int i = 0; i < n; i++) {
			R[i] = sc.nextInt();
		}
		
		int max = Integer.MIN_VALUE;
		
		for(int j = 1; j < n; j++) {
			for(int i = 0; i < n; i++) {
				if(i < j) {
					max = Math.max(max, R[j] - R[i]);	
				}
			}
		}
		
		System.out.println(max);
	}
}