import java.util.*;
import java.io.*;

public class Main {	
	static Map<Integer,List<Integer>> graph;
	static int[] distance;
	static int[] result;
	private static void solve(){
		//Implement solution here.
		graph = new HashMap<Integer, List<Integer>>();
		
		int N = ni();
		int M = ni();
		
		distance = new int[N + 1];
		result = new int[N + 1];
		
		for(int i = 0; i < M; i++) {
			int A = ni();
			int B = ni();
			if(!graph.containsKey(A)) graph.put(A,new ArrayList<Integer>());
			graph.get(A).add(B);
			if(!graph.containsKey(B)) graph.put(B,new ArrayList<Integer>());
			graph.get(B).add(A);
		}
		
		Queue<Integer> q = new ArrayDeque<Integer>();
		Queue<Integer> qd = new ArrayDeque<Integer>();
		q.add(1);
		qd.add(1);
		while(!q.isEmpty()) {
			int idx = q.poll();
			int dist = qd.poll();
			for(int next: graph.get(idx)) {
				if(distance[next] == 0) {
					distance[next] = dist;
					result[next] = idx;
					q.add(next);
					qd.add(dist + 1);
				} else {
					if(distance[next] < dist) {
						continue;
					} else {
						distance[next] = dist;
						result[next] = idx;
						q.add(next);
						qd.add(dist + 1);
					}
				}
			}
		}

		boolean ok = true;
		for(int i = 2; i <= N; i++) {
			if(result[i] == 0) {
				ok = false;
			}
		}
		
		if(ok) {
			for(int i = 2; i <= N; i++) {
				System.out.println(result[i]);
			}
		} else {
			System.out.println("No");
		}
	}
	
//	private static void rec(int from, int idx,int dist) {
//		if(distance[idx] == 0) {
//			distance[idx] = dist;
//			result[idx] = from;
//		} else {
//			if(distance[idx] < dist) {
//				return;
//			} else {
//				distance[idx] = dist;
//				result[idx] = from;
//			}
//		}
//		for(int next:graph.get(idx)) {
//			rec(idx, next,dist + 1);
//		}		
//	}

	//Switch input source (stdin/file)
	private static BufferedReader br;
	public static void main(String[] args){
		br = new BufferedReader(new InputStreamReader(System.in));
		String debugDataPath = System.getenv("DD_PATH");        
		if(debugDataPath != null){
			try{
				br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(debugDataPath))));
			}catch(Exception e){
				throw new RuntimeException(e);
			}
		}
		boolean hasNext = true;
		while(hasNext){
			solve();	
			try{
				br.mark(1);
				if(br.read() > 0){
					br.reset();			
					System.out.println("---");
				} else {
					hasNext = false;
				}
			}catch(Exception e){
				throw new RuntimeException(e);
			} 
		}
	}

	//Input read utility
	private static StringTokenizer tokenizer = null;
	public static String next() {
		while (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(br.readLine());
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}
	//Get next single int
	private static int ni() {
		return Integer.parseInt(next());
	}
	//Get next single long
	private static long nl() {
		return Long.parseLong(next());
	}
	//Get next single double
	private static double nd() {
		return Double.parseDouble(next());
	}
	//Get next int array from one line
	private static int[] na(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = ni();
		return a;
	}
	//Get next char array from one line
	private static char[] ns() {
		return next().toCharArray();
	}
	//Get next long array from one line
	private static long[] nal(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nl();
		return a;
	}
}
