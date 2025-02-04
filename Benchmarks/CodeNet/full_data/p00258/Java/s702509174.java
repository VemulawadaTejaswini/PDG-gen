import java.util.*;

public class Main {
	int count;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int c = sc.nextInt();
			if((n|c) == 0) break;
			int [] data1 = new int[n];
			for(int i = 0; i < n; i++){
				StringBuilder sb = new StringBuilder();
				for(int j = 0; j < 16; j++){
					sb.append(sc.nextInt());
				}
				data1[i] = Integer.parseInt(sb.toString(), 2);
			}
			String [] data2 = new String[c];
			for(int i = 0; i < c; i++){
				StringBuilder sb = new StringBuilder();
				for(int j = 0; j < 16; j++){
					sb.append(sc.nextInt());
				}
				data2[i] = sb.toString();
			}
			int [][] dp = new int[2][1 << 16];
			for(int i = 0; i < 2; i++){
				Arrays.fill(dp[i], -1);
			}
			dp[0][0] = 0;
			int max = 0;
			for(int i = 0; i < n; i++){
				int ind = i & 1;
				for(int j = 0; j < (1 << 16); j++){
					if(dp[ind][j] < 0) continue;
					dp[ind ^ 1][j] = Math.max(dp[ind ^ 1][j], dp[ind][j]);
					max = Math.max(max, dp[ind ^ 1][j]);
					for(int k = 0; k < c; k++){
						int temp = data1[i] | j;
						int nextbit = calc(temp, data2[k]);
						int value = dp[ind][j] + count;
						dp[ind ^ 1][nextbit] = Math.max(dp[ind ^ 1][nextbit], value);
						max = Math.max(max, dp[ind ^ 1][nextbit]);
					}
				}
				Arrays.fill(dp[ind], -1);
			}
			System.out.println(max);
		}
	}
	
	private int calc(int temp, String string) {
		long a = Long.parseLong(Integer.toBinaryString(temp));
		String str = String.format("%016d",a) ;
		StringBuilder res = new StringBuilder();
		count = 0;
		for(int i = 0; i < 16; i++){
			if(str.charAt(i) == '0'){
				res.append(0);
			}
			else{
				if(string.charAt(i) == '0'){
					res.append(1);
				}
				else{
					count++;
					res.append(0);
				}
			}
		}
		return Integer.parseInt(res.toString(), 2);
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}