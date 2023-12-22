import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int w = sc.nextInt();
			if(n==0 && w==0) break;
			
			int[] a = new int[12];
			int maxw = 0;
			int maxv = 0;
			for(int i=0;i<n;i++){
				int v = sc.nextInt();
				a[v/w]++;
				maxw = Math.max(maxw, v/w);
				maxv = Math.max(maxv, a[v/w]);
			}
			
			double sum = 0.01;
			for(int i=0;i<=maxw;i++){
				sum += ((double)(maxw-i)/maxw)*((double)a[i]/maxv);
			}
			System.out.println(sum);
		}	
	}	
}