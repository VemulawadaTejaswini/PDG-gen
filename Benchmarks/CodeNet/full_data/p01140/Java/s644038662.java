import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n==0 && m==0) break;
			
			int ans = 0;
			int[] h = new int[n+1];
			int[] w = new int[m+1];
			int[] len = new int[1000*1500+2];
			for(int i=1;i<=n;i++){
				h[i] = h[i-1] + sc.nextInt();
				for(int j=i-1;j>=0;j--) len[h[i]-h[j]]++;
			}
			for(int i=1;i<=m;i++){
				w[i] = w[i-1] + sc.nextInt();
				for(int j=i-1;j>=0;j--){
					if(len[w[i]-w[j]]>0) ans += len[w[i]-w[j]];
				}
			}
			System.out.println(ans);
		}	
	}	
}