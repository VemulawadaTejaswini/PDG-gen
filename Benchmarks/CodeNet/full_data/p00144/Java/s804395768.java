import java.util.*;
import java.io.*;

public class Main {
	
	public void solve() throws IOException {
		int n = nextInt();
		Map<Integer, Set<Integer>> map = new HashMap<Integer, Set<Integer>>();
		for(int i = 0; i < n; i++){
			int id = nextInt();
			int num = nextInt();
			Set<Integer> set = new HashSet<Integer>();
			for(int j = 0; j < num; j++){
				int x = nextInt();
				set.add(x);
			}
			map.put(id, set);
		}
		int m = nextInt();
		for(int i = 0; i < m; i++){
			int start = nextInt();
			int stop = nextInt();
			int live = nextInt();
			int repeat = live-1;
			Set<Integer> temp = new HashSet<Integer>(map.get(start));
			Set<Integer> add = new HashSet<Integer>(map.get(start));
		out:while( repeat-- > 0 && !temp.contains(stop) ){
				Set<Integer> next = new HashSet<Integer>();
				for(Integer x : add){
					for(Integer y : map.get(x)){
						if( !temp.contains(y) ){
							temp.add(y);
							next.add(y);
						}
					}
				}
				add = new HashSet<Integer>(next);
			}
			if( repeat >= 0 ){
				writer.println(live-repeat);
			} else {
				writer.println("NA");
			}
		}					
		writer.flush();
	}
	public static void main (String args[]) throws IOException{
		new Main().run();
	}
	
	BufferedReader reader;
	StringTokenizer tokenizer;
	PrintWriter writer;
	
	public void run() throws IOException{
		try{
			reader = new BufferedReader(new InputStreamReader(System.in));
			tokenizer = null;
			writer = new PrintWriter(System.out);
			solve();
			reader.close();
			writer.close();
		} catch (Exception e){
			e.printStackTrace();
			System.exit(1);
		}
	}
	public int nextInt() throws IOException{
		return Integer.parseInt(nextToken());
	}		
	public String nextToken() throws IOException{
		while( tokenizer == null || !tokenizer.hasMoreTokens() ){
			tokenizer = new StringTokenizer(reader.readLine());
		}
		return tokenizer.nextToken();
	}
}