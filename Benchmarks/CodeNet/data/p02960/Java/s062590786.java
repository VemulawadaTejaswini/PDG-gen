import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		long mod=1000000007;
		long[][] dp=new long[s.length()+1][13];
		dp[0][0]=1;
		int rt=1;
		for(int i=1; i<=s.length(); i++){
			if(i!=1){
				rt*=10;
				rt%=13;
			}
			if(s.charAt(s.length()-i)=='?'){
				for(int j=0; j<10; j++){
					for(int u=0; u<13; u++){
						int c=(j*rt)%13;
						dp[i][(c+u)%13]=(dp[i][(c+u)%13]+dp[i-1][u])%mod;
					}
				}
			}else{
				int k=s.charAt(s.length()-i)-'0';
				k*=rt;
				k%=13;
				for(int j=0; j<13; j++){
					dp[i][(j+k)%13]=(dp[i-1][j])%mod;
				}
			}
		}
		System.out.println(dp[s.length()][5]);
	}
}
