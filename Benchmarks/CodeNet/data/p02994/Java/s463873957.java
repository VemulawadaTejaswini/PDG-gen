import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
 
 
public class Main {

	static long MOD = 1_000_000_007;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//int N = Integer.parseInt(sc.next());
		//long L = Long.parseLong(sc.next());

		Scanner sc = new Scanner(System.in);
		//char[] c = sc.next().toCharArray();
		int N = Integer.parseInt(sc.next());
		int L = Integer.parseInt(sc.next());
		int INF = Integer.MAX_VALUE;
		int INF_MIN = -1000;//Integer.MIN_VALUE;
		
		int min = INF;
		int min_ = INF;
		int sum = 0;
		for(int i=0; i<N; i++){
			if(min > Math.abs(L+i)){
				min = Math.abs(L+i);
				min_ = L+i;
			}

			sum += L+i;
		}
		int ans = sum - min_;

		System.out.println(ans);
		
		
	
		
		
	}
}

