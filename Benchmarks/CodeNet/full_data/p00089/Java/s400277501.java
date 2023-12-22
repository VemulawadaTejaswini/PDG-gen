
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
		
		int data[][]=new int[maxn][maxn],dp[][]=new int[maxn][maxn];
		h=0;
		for(int i=0;i<list.size();i++) {
			if(i>p)h=i-p;
			String[] nums=list.get(i);
			for(int j=0;j<nums.length;j++) {
				if(i<=p)data[nums.length-j-1][j]=Integer.parseInt(nums[j]);
				else data[maxn-j-1][h+j]=Integer.parseInt(nums[j]);
			}
		}
		
		
		dp[0][0]=data[0][0];
		for(int i=0;i<maxn;i++) {
			for(int j=0;j<maxn;j++) {
				if(i+1<=maxn-1)dp[i+1][j]=Math.max(dp[i+1][j], dp[i][j]+data[i+1][j]);
				if(j+1<=maxn-1)dp[i][j+1]=Math.max(dp[i][j+1], dp[i][j]+data[i][j+1]);
			}
		}

		System.out.println(dp[maxn-1][maxn-1]);
	}

}


