
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int maxn=0,p=0;
		List<String[]> list=new ArrayList<>();
		
		int h=0;
		while(in.hasNext()) {
			String str=in.next();
			String datas[]=str.split(",");
			list.add(datas);
			if(datas.length>maxn) {
				maxn=datas.length;
				p=h;
			}
			h++;
		}
		
		int dp[][]=new int[maxn][maxn];
		for(int i=0;i<maxn;i++) {
			for(int j=0;j<maxn;j++)dp[i][j]=-1;
		}
		dp[0][0]=Integer.parseInt(list.get(0)[0]);
		
		for(int i=0;i<maxn;i++) {
			for(int j=0;j<maxn;j++) {
				if(dp[i][j]==-1)break;
				
				String[] nums=list.get(i+j+1);
				if(i+j+1>p) {
					if(i+j+1>p && i==maxn-1)dp[i][j+1]=Math.max(dp[i][j+1], dp[i][j]+Integer.parseInt(nums[0]));
					else if(i+j+1>p && j==maxn-1)dp[i+1][j]=Math.max(dp[i+1][j], dp[i][j]+Integer.parseInt(nums[nums.length-1]));
					else {
						dp[i+1][j]=Math.max(dp[i+1][j],dp[i][j]+Integer.parseInt(nums[j-1]));
						dp[i][j+1]=Math.max(dp[i][j+1], dp[i][j]+Integer.parseInt(nums[j]));
					}
				}
				else {
					dp[i+1][j]=Math.max(dp[i+1][j], dp[i][j]+Integer.parseInt(nums[j]));
					dp[i][j+1]=Math.max(dp[i][j+1], dp[i][j]+Integer.parseInt(nums[j+1]));
				}
			}
		}
		System.out.println(dp[maxn][maxn]);
	}

}

