import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			
			int[] a = new int[n];
			for(int i=0;i<n;i++) a[i] = sc.nextInt();
			int p = sc.nextInt();
			
			int s = 0;
			int g = n-1;
			int m;
			int count = 0;
			
			while(true){
				count++;
				m = s + (g-s)/2;
				if(s==g || a[m]==p) break;
				if(a[m]<p) s = m+1;
				else g = m-1;
			}
			System.out.println(count);
		}	
	}	
}