import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		String S=stdIn.next();
		int dp[][]=new int[S.length()+5][13];
		dp[0][0]=1;
		int z=0;
		while(z<S.length()){
			char a=S.charAt(z);
			int y=0,ki=0;
			if(a=='?'){
				while(y<10){
					while(ki<13){
						dp[z+1][(ki*10+y)%13]+=dp[z][ki];
						dp[z+1][(ki*10+y)%13]%=1000000007;
						ki++;
					}ki=0;
					y++;
				}y=0;
			}
			else{
				y=a-'0';
				while(ki<13){
					dp[z+1][(ki*10+y)%13]+=dp[z][ki];
					dp[z+1][(ki*10+y)%13]%=1000000007;
					ki++;
				}ki=0;
			}
			z++;
		}
		System.out.println(dp[S.length()][5]);
	}
}