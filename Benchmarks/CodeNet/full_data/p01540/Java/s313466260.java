import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int[] x = new int[n];
			int[] y = new int[n];
			
			for(int i=0;i<n;i++){
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
			}
			
			int cnt, a, b, c, d;
			for(int i=0;i<m;i++){
				cnt = 0;
				a = sc.nextInt();
				b = sc.nextInt();
				c = sc.nextInt();
				d = sc.nextInt();
				for(int j=0;j<n;j++){
					if(a<=x[j] && x[j]<=c && b<=y[j] && y[j]<=d) cnt++;
				}
				System.out.println(cnt);
			}			
		}	
	}	
}