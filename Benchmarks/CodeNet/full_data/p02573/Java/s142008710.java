import java.util.*;
import java.io.*;

public class Main {
	
	static boolean vis[];
	static HashMap<Integer, ArrayList<Integer>> map;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));		
		String st = bi.readLine();		
		StringTokenizer str = new StringTokenizer(st, " ");
		map = new HashMap<Integer, ArrayList<Integer>>();
		int n = Integer.parseInt(str.nextToken());
		int m = Integer.parseInt(str.nextToken());
		int gd = 1;
		
		vis = new boolean[n+1];
		
		for(int i = 0; i < m; i++) {
			
			st = bi.readLine();
			str = new StringTokenizer(st);
			Integer a = Integer.parseInt(str.nextToken());
			Integer b = Integer.parseInt(str.nextToken());
			
			if(!map.containsKey(a))
				map.put(a, new ArrayList<Integer>());
			if(!map.get(a).contains(b))
				map.get(a).add(b);
			
			if(!map.containsKey(b))
				map.put(b, new ArrayList<Integer>());
			if(!map.get(b).contains(a))
				map.get(b).add(a);
			
			
		}
		
		Iterator<Integer> itr = map.keySet().iterator();
		
		while(itr.hasNext()) {

			int tmp = itr.next();
			
			if(!vis[tmp])
				gd = Math.max(gd, dfs(tmp));
			
		}
		
		System.out.println(gd);
		
	}	
	
	static int dfs(Integer n) {
		
		int ret = 1;
		
		vis[n] = true;
		
		ArrayList<Integer> tmp = map.get(n);
		int sz = tmp.size();
		
		for(int i = 0; i < sz; i++) {
			
			if(!vis[tmp.get(i)])
				ret += dfs(tmp.get(i));
		
		}
		
		return ret;
		
	}

}