import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		List<int[]> list = new ArrayList<>();
		for(int i=0;i<m;i++) {
			int[] tmp = new int[2];
			tmp[0] = in.nextInt();
			if(tmp[0]==1) tmp[1] = 2;
			else if(tmp[0]==7) tmp[1] = 3;
			else if(tmp[0]==4) tmp[1] = 4;
			else if(tmp[0]==2 || tmp[0]==3 || tmp[0]==5) tmp[1] = 5;
			else if(tmp[0]==6 || tmp[0]==9) tmp[1] = 6;
			else tmp[1] = 7;
			list.add(tmp);
		}
		int[] dp = new int[n+1];
		for(int i=2;i<=n;i++) {
			for(int j=0;j<list.size();j++) {
				int match = list.get(j)[1];
				if(i-match>=0) {
					dp[i] = Math.max(dp[i], dp[i-match]+1);
				}
			}
		}
		list.sort((a,b)->(-a[0]+b[0]));
		String ans = "";
		int ptr = 0;
		int i = n;
		int digit = dp[n];
		while(true) {
			if(digit==1) {
				if(i-list.get(ptr)[1]==0) {
					ans += list.get(ptr)[0];
					break;
				}else ptr++;
			}else if(dp[i-list.get(ptr)[1]]==digit-1) {
				ans += list.get(ptr)[0];
				i -= list.get(ptr)[1];
				digit--;
			}else ptr++;
		}
		System.out.println(ans);
		in.close();
	}

}
