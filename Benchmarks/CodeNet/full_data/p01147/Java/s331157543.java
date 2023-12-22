import java.util.*;

public class Main {

	final int INF = 1 << 24;
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			String [] data = new String[n];
			int [][] dp = new int[n][1 << n];
			String [][] dpStr = new String[n][1 << n];
			for(int i =0; i < n; i++){
				Arrays.fill(dp[i], INF);
				Arrays.fill(dpStr[i], "");
			}
			for(int i=0; i < n; i++){
				data[i] = sc.next();
				dp[i][1 << i] = data[i].length();
				dpStr[i][1 << i] = data[i];
				//System.out.println("1 << i = " + (1 << i));
			}
			int len = 1 << n;
			for(int i = 0; i <len; i++ ){
				for(int j = 0; j < n;j++){
					if(dp[j][i] == INF) continue;
					for(int k = 0; k < n; k++){
						if((i & (1 << k)) != 0) continue;
						int ind = i | (1 << k);
						int addlen = getlen(data[j],data[k]);
						int value = addlen + dp[j][i];
						//System.out.println("ind= " + ind + "value= "+ (value) + "dp=" + dp[j][i]);
						//dp[k][ind] = Math.min(dp[k][ind], dp[j][i] + value);
						if(dp[k][ind] > value){
							dp[k][ind] = value;
							int klen = data[k].length();
							String addStr = data[k].substring(klen - addlen, klen);
							//System.out.println("as = " + addStr);
							dpStr[k][ind] = dpStr[j][i] + addStr;
						}
					}
				}
			}
			
//			for(int i=0; i < n; i++){
//				for(int j = 0; j < len; j++){
//					System.out.print(dpStr[i][j]+ i+ j + " ");
//				}
//				System.out.println();
//			}
			int ans = INF;
			String str = "";
			for(int i=0; i < n; i++){
				//ans = Math.min(ans, dp[i][len-1]);
				if(ans > dp[i][len-1]){
					ans = dp[i][len-1];
					str = dpStr[i][len-1];
				}
				else if(ans != INF && ans == dp[i][len-1]){
					if(str.compareTo(dpStr[i][len-1]) > 0){
						str = dpStr[i][len-1];
					}
				}
			}
			//System.out.print("NAS= ");
			System.out.println(str);
		}
	}
	private int getlen(String a, String b) {
		int res=b.length(),i = 0;
		//System.out.println(b + " " + b.length());
		StringBuilder sb = new StringBuilder();
		for(i=0; i < b.length() && i < a.length();i++){
			sb.append("" + b.charAt(i));
			if(a.endsWith(sb.toString())){
				
				res = b.length() - i- 1;
				//System.out.println(res + " " + sb.toString() + " " + i );
			}
		}
		//System.out.println(res);
		return res;
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}