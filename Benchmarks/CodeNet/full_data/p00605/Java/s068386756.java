import java.awt.geom.Point2D;
import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		while(in.hasNext())new AOJ1019().doIt();
	}

	class AOJ1019{

		boolean solve(){
			int[] blood = new int[k];
			for(int i=0;i<k;i++)blood[i] = in.nextInt();
//			System.out.println(Arrays.toString(blood));
			int person[][] = new int[n][k];
			for(int i=0;i<n;i++)for(int s=0;s<k;s++)person[i][s] = in.nextInt();
			boolean sw = true;
			for(int i=0;i<k;i++){
				int sum = 0;
				for(int s=0;s<n;s++)sum+=person[s][i];
//				System.out.println(i+" "+sum+" "+blood[i]);
				if(sum>blood[i])return false;
			}
			return true;
		}
		
		int n,k;
		
		void doIt(){
			n = in.nextInt();
			k = in.nextInt();
			if(n+k==0)return;
			System.out.println(solve()? "Yes":"No");
		}
	}
}