import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(),m=in.nextInt();
		
		int DP[]=new int[n+1];
		Arrays.fill(DP, n);
		DP[0]=0;
		for(int i=0;i<m;i++) {
			int c=in.nextInt();
			for(int j=0;j<=n;j++) {
				if(j-c>=0) {
					DP[j]=Math.min(DP[j], DP[j-c]+1);
				}
			}
		}
		System.out.println(DP[n]);
	}

}
