import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
 
 
public class Main {

	static long MOD = 1_000_000_007;
	static int[][] map;
	static long[][] dp;
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//int N = Integer.parseInt(sc.next());
		//long L = Long.parseLong(sc.next());
		//char[] c = sc.next().toCharArray();
		int INF = Integer.MAX_VALUE;
		int ans = 0;
		
		Scanner sc = new Scanner(System.in);
		int X = Integer.parseInt(sc.next());
		int A = Integer.parseInt(sc.next());
		
		if (X<A){
			ans=0;
		}else{
			ans=10;
		}

		
		System.out.println(ans);
		
	}
}

