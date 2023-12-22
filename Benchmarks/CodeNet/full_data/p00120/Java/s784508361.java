import java.util.Scanner;

//Patisserie
public class Main{

	static double[][][] dp;
	static int[] r;
	static int n;
	
	static double get(int left, int s, int right){
		if(dp[left][s][right]!=0)return dp[left][s][right];
		int c = 0;
		for(int i=0;i<n;i++)if((s&(1<<i))>0)c++;
		if(c==1){
			return dp[left][s][right] = 2*r[left];
		}
		if(c==2){
			if(r[left]==r[right])return dp[left][s][right] = 4*r[left];
			else return dp[left][s][right] = r[left]+r[right]+Math.sqrt(-Math.pow(r[left]-r[right], 2) + Math.pow(r[left]+r[right], 2));
		}
		double min = Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
			if((s&(1<<i))==0 || i==left || i==right)continue;
			for(int j=0;j<n;j++){
				if((s&(1<<j))==0 || j==right || j==left)continue;
				if(c>3 && i==j)continue;
				double x = r[left]+r[right]-r[i]-r[j]+get(i, s-(1<<left)-(1<<right),j);
				if(r[left]==r[i]){
					x += 2*r[i];
				}
				else {
					x += Math.sqrt(Math.pow(r[left]+r[i], 2)-Math.pow(r[left]-r[i], 2));
				}
				if(r[right]==r[j]){
					x += 2*r[j];
				}
				else {
					x += Math.sqrt(Math.pow(r[right]+r[j], 2)-Math.pow(r[right]-r[j], 2));
				}
				min = Math.min(min, x);
			}
		}
		return dp[left][s][right] = min;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String[] s = sc.nextLine().split(" ");
			n = s.length-1;
			int len = Integer.parseInt(s[0]);
			r = new int[n];
			for(int i=0;i<n;i++)r[i]=Integer.parseInt(s[i+1]);
			dp = new double[n][1<<n][n];
			double min = Integer.MAX_VALUE;
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					if(n>1 && i==j)continue;
					min = Math.min(min, get(i, (1<<n)-1, j));
				}
			}
			System.out.println(min<=len?"OK":"NA");
		}
	}
}