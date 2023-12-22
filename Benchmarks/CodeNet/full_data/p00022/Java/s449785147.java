
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(true){
			int n=in.nextInt();
			if(n==0)break;
			int dp[]=new int[n+1],res=-100001;
			
			for(int i=0;i<n;i++){
				int a=Integer.parseInt(in.next());
				dp[i+1]=Math.max(0, dp[i]+a);
				res=Math.max(res, dp[i+1]);
			}

			System.out.println(res);
		}
	}

}

