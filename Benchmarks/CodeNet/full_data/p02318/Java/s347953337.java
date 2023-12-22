import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String[] a2 = a.split("");
		String b = scan.nextLine();
		String[] b2 = b.split("");
		int al = a.length();
		int bl = b.length();
		int[][] dp = new int[bl+1][al+1];
		String a3="",b3="";
		for(int i=1;i<=al;++i){
			dp[0][i]=dp[0][i-1]+1;
		}
		for(int i=1;i<=bl;++i){
			dp[i][0]=dp[i-1][0]+1;
		}
		for(int i=1;i<=bl;++i){
			a3="";
			b3+=b2[i-1];
			for(int j=1;j<=al;++j){
				a3+=a2[j-1];
				int min = Min(dp[i-1][j-1],dp[i][j-1],dp[i-1][j]);
				if(b3.equals(a3)==true){
					dp[i][j]=min;
				} else {
					dp[i][j]=min+1;
				}
			}
		}
		System.out.println(dp[bl][al]);
	}

	public static int Min(int a, int b, int c){
		int min=a;
		if(a>b){
			min=b;
		}
		if(min>c){
			min=c;
		}
		return min;
	}
}