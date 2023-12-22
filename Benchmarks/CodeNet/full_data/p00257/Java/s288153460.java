
import java.util.Scanner;

public class Main {

	static int max,n,now,goal,me;
	static int[] field;
	static int[][] dp;
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		for(;;){
			max=cin.nextInt();
			if(max==0)break;
			n=cin.nextInt();
			now=0;
			goal=n+1;
			field=new int[n+2];
			dp=new int[n+2][max+1];
			for(int i=1;i<=n;i++){
				field[i]=cin.nextInt();
			}
			boolean ans=false;
			for(me=2;me<=max;me++){
				if(bt(0)){
					ans=true;
//					System.out.println(me+" "+true);
				}
				else{
//					System.out.println(me+" "+false);
				}
			}
			if(ans){
				System.out.println("OK");	
			}
			else{
				System.out.println("NG");
			}
			
		}

	}
	static boolean bt(int now){
//		System.out.println(now);
		if(dp[now][me]==1)return false;
		dp[now][me]=1;
		if(now==goal)return true;
		for(int i=1;i<me;i++){
			if(bt(decide(now,i))){
				return true;
			}
		}
		return false;
	}
	static int  decide(int now,int me){
		now+=me;
		if(now>goal){
			now=goal;
		}
		now += field[now];
		if(now>goal){
			now=goal;
		}
		if(now<0){
			now=0;
		}
		return now;
	}
}