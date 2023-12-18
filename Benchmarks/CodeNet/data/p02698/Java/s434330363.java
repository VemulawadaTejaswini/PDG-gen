import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	static class Node{
		List<Integer> adj;
		int val;
		public Node(int v) {
			adj = new ArrayList<Integer>();
			val = v;
		}
	}
	static int bsearch(int[] dp , int len, int val){
		if(len == 0){
			return 0;
		}
		if(dp[len - 1] < val){
			return len;
		}
		if(dp[0] >= val){
			return 0;
		}
		// dp[0] < val
		// dp[len - 1] >= val
		int left = 0;
		int right = len - 1;
		while(right - left > 1){
			int mid = (left + right) / 2;
			if(dp[mid] >= val){
				right = mid;
			}else{
				left = mid;
			}
		}
		return right;
	}
	static void rec(int cur , int parent , int depth , int dpLength , int dp[], int[] result, Node[] ns){
		// update LIS
		int pos = bsearch(dp, dpLength, ns[cur].val);
		int prev = -1;
//		System.out.println(cur+" "+Arrays.toString(dp)+ " "+dpLength);
		if(dpLength <= pos){
			dp[dpLength] = ns[cur].val;
			dpLength += 1;
		}else{
			prev = dp[pos];
			dp[pos] = ns[cur].val;
		}
//		System.out.println(cur+" "+Arrays.toString(dp)+ " "+dpLength);
		result[cur] = dpLength;
		for(int a : ns[cur].adj){
			if(a == parent){
				continue;
			}
			rec(a , cur , depth + 1 , dpLength, dp , result , ns);
		}
		// recover LIS
		if(depth <= pos){
			dpLength--;
		}else{
			dp[pos] = prev;
		}
	}
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		Node ns[] = new Node[N];
		line = br.readLine();
		String as[] = line.split(" ");
		for(int i = 0 ; i < N ; ++i){
			int a = Integer.parseInt(as[i]);
			ns[i] = new Node(a);
		}
		for(int i = 0 ; i < N - 1; ++i){
			line = br.readLine();
			as = line.split(" ");
			int u = Integer.parseInt(as[0]) - 1;
			int v = Integer.parseInt(as[1]) - 1;
			ns[u].adj.add(v);
			ns[v].adj.add(u);
		}
		int dp[] = new int[N];	
		int result[] = new int[N];
		rec(0 , 0 , 0 , 0 , dp , result , ns);
		StringBuilder sb = new StringBuilder();
		for(int r : result){
			sb.append(r);
			sb.append('\n');
//			System.out.println(r);
		}
		System.out.println(sb);
	}
}
