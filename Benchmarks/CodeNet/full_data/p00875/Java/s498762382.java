import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main{

	int maxDepth;
	String goal, cur;
	HashMap<String, String> dict;
	String[] rule;
	int N;
	Set<String> visited;

	void run(){
		Scanner in = new Scanner(System.in);
		for(;;){
			N = in.nextInt();
			if(N==0) return ;
			dict = new HashMap<String, String>();
			rule = new String[N];
			for(int i=0; i<N; i++){
				rule[i] = in.next();
				dict.put(rule[i], in.next());
			}
			cur = in.next();
			goal = in.next();
			System.out.println(solve());
		}
	}

	int solve(){
		if(cur.equals(goal)) return 0;
		for(maxDepth = 1; maxDepth <= 100; maxDepth++){
			visited = new HashSet<String>();
			if(dfs(0)) return maxDepth;
		}
		return -1;
	}

	boolean dfs(int depth){
		if(depth > maxDepth || cur.length() > goal.length() || visited.contains(cur)) return false;
		if(depth > maxDepth) return false;
		if(cur.equals(goal)) return true;
		visited.add(cur);
		String tmp = cur.toString();
		for(int i=0; i<N; i++){
			cur = tmp.replaceAll(rule[i], dict.get(rule[i]));
			if(dfs(depth+1)) return true;
		}
		cur = tmp.toString();
		return false;
	}

	public static void main(String args[]){
		new Main().run();
	}
}