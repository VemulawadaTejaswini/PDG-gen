import java.util.*;
import java.math.BigInteger;

public class Main{
	static int w,h;
	static int di[]={0,1}, dj[]={1,0};
	static char[][] map;
	static BigInteger max;
	static String[][] dp;

	public static String dfs(int i,int j){
		if(dp[i][j] != null) return dp[i][j];

		String s = Character.toString(map[i][j]);
		List<String> res = new ArrayList<String>();
		for(int k=0;k<2;k++){
			int ni = i + di[k];
			int nj = j + dj[k];

			if(ni>=0 && ni<h && nj>=0 && nj<w && Character.isDigit(map[ni][nj])) res.add(dfs(ni,nj));
		}

		if(res.isEmpty()) return (dp[i][j]=s);
		else if(res.size() == 1) return (dp[i][j]=s+res.get(0));
		else{
			if(new BigInteger(res.get(0)).compareTo(new BigInteger(res.get(1)))>0) return (dp[i][j]=s+res.get(0));
			else return (dp[i][j]=s+res.get(1));
		}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		BigInteger res;

		while(true){
			w = sc.nextInt();
			h = sc.nextInt();
			if(w==0 && h==0) break;
			map = new char[h][w];
			dp = new String[h][w];
			max = BigInteger.ZERO;

			for(int i=0;i<h;i++) map[i] = sc.next().toCharArray();

			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					if(Character.isDigit(map[i][j])){
						res = new BigInteger(dfs(i,j));
						if(max.compareTo(res) < 0) max = res;
					}
				}
			}
			System.out.println(max);
		}
	}
}