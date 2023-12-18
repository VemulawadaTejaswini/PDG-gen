import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int[] w = new int[n+1];
		int[] count = new int[n+1];
		for(int i=1;i<n+1;i++){
			w[i] = sc.nextInt();
			sum += w[i];
		}
		int min = sum;
		for(int i=1;i<n+1;i++){
			count[i]+=count[i-1]+w[i];
		}
		for(int i=1;i<n+1;i++){
			if(Math.abs(sum-2*count[i])<min) min = Math.abs(sum-2*count[i]); 
		}
		System.out.println(min);
	}
}
				
