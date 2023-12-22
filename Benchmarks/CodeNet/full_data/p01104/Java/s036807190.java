import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n!=0){
			int m = sc.nextInt();
			if(n<m){
				String[] recipe = new String[n];
				for(int i=0; i<n; i++){
					recipe[i] = sc.next();
				}
				int ans = 0;
				int[] xor = new int[m];
				for(int i=0; i<Math.pow(2, n); i++){
					Arrays.fill(xor, 0);
					int cnt = 0;
					for(int j=0; j<n; j++){
						if((1&(i>>j))==1){
							cnt++;
							for(int k=0; k<m; k++){
								xor[k] = (xor[k] + Character.getNumericValue(recipe[j].charAt(k)))%2;
							}
						}
					}
					boolean flag = false;
					for(int j=0; j<m; j++){
						if(xor[j]==1){
							flag = true;
							break;
						}
					}
					if(flag==false){
						ans = Math.max(ans, cnt);
					}
				}
				System.out.println(ans);
			}
			else{
				int[] recipe = new int[n];
				for(int i=0; i<n; i++){
					recipe[i] = Integer.parseInt(sc.next(), 2);
				}
				int[][] dp = new int[n+1][(int)Math.pow(2, m)];
				for(int i=0; i<n+1; i++){
					Arrays.fill(dp[i], -1000);
				}
				dp[0][0] = 0;
				for(int i=1; i<n+1; i++){
					for(int j=0; j<Math.pow(2, m); j++){
						dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j^recipe[i-1]]+1);
					}
				}
				System.out.println(dp[n][0]);
			}
			n = sc.nextInt();
		}
	}
}
