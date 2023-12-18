import java.util.*;

class Main {
	static String a; 
	static String b;
	static int aLen;
	static int bLen;
	static int[][] dp;
	static int[][][] nxt;
	static String[][] val;

	public static int dfs(int pa, int pb) {
		// System.out.println(Integer.toString(pb) + " " + Integer.toString(pa));
		if(pa >= aLen || pb >= bLen) {
			nxt[pa][pb][0] = pa; nxt[pa][pb][1] = pb;
			// val[pa][pb] = "";
			return 0;
		}

		if(dp[pa][pb] == -1) {
			dp[pa][pb] = 0;
			if(a.charAt(pa) == b.charAt(pb)) {
				dp[pa][pb] = 1 + dfs(pa+1, pb+1);
				nxt[pa][pb][0] = pa+1; nxt[pa][pb][1] = pb+1; val[pa][pb] = Character.toString(a.charAt(pa));
			} else {
				int i = dfs(pa+1, pb);
				int j = dfs(pa, pb+1);

				if(i > j) {
					dp[pa][pb] = i;
					nxt[pa][pb][0] = pa+1; nxt[pa][pb][1] = pb; val[pa][pb] = "";
				} else {
					dp[pa][pb] = j;
					nxt[pa][pb][0] = pa; nxt[pa][pb][1] = pb+1; val[pa][pb] = "";
				}		
			}
		}

		return dp[pa][pb];
	}

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

    	a = sc.nextLine(); b = sc.nextLine();
    	aLen = a.length(); bLen = b.length();

    	dp = new int[aLen][bLen];
    	for(int[] i : dp) 
    		Arrays.fill(i, -1);
    	nxt = new int[aLen+5][bLen+5][2]; val = new String[aLen][bLen]; 

    	dfs(0, 0);
    	int i = 0;
    	int j = 0;
    	String ans = "";
    	while(i < aLen && j < bLen) {
    		ans += val[i][j];
    		int newi = nxt[i][j][0]; 
    		int newj = nxt[i][j][1];
    		i = newi; j = newj;
    	}
    	System.out.println(ans);
    }
}

