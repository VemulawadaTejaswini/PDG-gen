import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] x=new int[m];
		int[] y=new int[m];
		int[] BallCount=new int[n+1];
		boolean[] poss=new boolean[n+1];
		
		for(int i=0;i<m;i++){
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
		}
		Arrays.fill(poss, false);
		poss[1]=true;
		Arrays.fill(BallCount, 1);
		for(int i=0;i<m;i++){
			
			if(poss[x[i]])poss[y[i]]=true;
			
			BallCount[x[i]]-=1;
			BallCount[y[i]]+=1;
			
			if(BallCount[x[i]]==0)poss[x[i]]=false;
			
		}
		int BallBox=0;
		for(int i=1;i<=n;i++){
			if(poss[i])BallBox++;
		}
		System.out.println(BallBox);
		
	}

}
