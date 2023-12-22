import java.util.Scanner;

public class Main {

	static int n,s,ans;
	static boolean[] already;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		for(;cin.hasNext();){
			n=cin.nextInt();
			s=cin.nextInt();
			ans=0;
			already=new boolean[10];
			for(int i=0;i<10;i++){
				already[i]=true;
				dp(1,i);	
				already[i]=false;
			}
			
			System.out.println(ans);
		}
	}
	static void dp(int step,int sum){
//		System.out.println(sum);
		if(step==n){
			if(sum==s){
				ans++;
			}
			return;
		}
		for(int i=0;i<10;i++){
			if(already[i])continue;
			already[i]=true;
			
			dp(step+1,sum+i*(step+1));
			already[i]=false;
		}
	}
}