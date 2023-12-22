import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static boolean[] p=new boolean[1000020];
	
	static void eratos() {
		Arrays.fill(p, true);
		p[0]=p[1]=false;
		for(int i=2; i*i<1000010; i++){
			if(p[i]){
				for(int j=2; i*j<1000010; j++){
					p[i*j]=false;
				}
			}
		}
	}

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			eratos();
			while(sc.hasNext()) {
				int n, x;
				n=sc.nextInt();
				x=sc.nextInt();
				int[] v=new int[n];
				if(n+x==0) break;

				for(int i=0; i<n; i++){
					v[i]=sc.nextInt();
				}
				
				//Arrays.sort(v);
				boolean[] dp=new boolean[1000010];
				dp[0]=true;

				for(int i=0; i<n; i++){
					for(int j=0; j<=x; j++){
						if(dp[j] && j+v[i]<=x) {
							dp[j+v[i]]=true;
						}
					}
				}
				int ans=-1;

				for(int i=x; i>1; i--){
					if(dp[i]){
						if(p[i]){
							ans=i;
							break;
						}
					}
				}
				System.out.println(ans==-1 ? "NA" : ans);
			}

		}
	}
}
