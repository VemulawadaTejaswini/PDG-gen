import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	public static char[] s;
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt();
			if(n == 0) break;
			HashMap<String, Integer> table = new HashMap<String, Integer>();
			Node[] node = new Node[n];
			for(int i=0; i<n; i++){
				String name = in.next();
				int pow = in.nextInt();
				int c = in.nextInt();
				table.put(name, i);
				node[i] = new Node(i, name, pow);
				for(int j=0; j<c; j++){
					node[i].names.add(in.next());
				}
			}
			for(int i=0; i<n; i++){
				for(String s: node[i].names){
					node[i].createEdge(node[table.get(s)]);
				}
			}
			Queue<Info> qu = new LinkedList<Info>();
			HM dp = new HM();
			qu.add(new Info(node[0].next, node[0].power));
			int res = 0;
			while(!qu.isEmpty()){
				Info s = qu.poll();
				if(!dp.put(s.used, s.power)) continue;
				res = Math.max(res, s.power);
				for(int i=0; i<n; i++){
					if((s.used&1L<<i)>0) continue;
					qu.add(new Info(s.used|node[i].next, s.power+node[i].power));
				}
			}
			System.out.println(res);
		}
	}
}

class HM{
	HashMap<Long, Integer> dp = new HashMap<Long, Integer>();
	boolean put(long key, int pow){
		if(!dp.containsKey(key)){
			dp.put(key, pow);
			return true;
		}
		int p = dp.get(key);
		if(p < pow){
			dp.put(key, pow);
			return true;
		}
		return false;
	}
}

class Info{
	long used;
	int power;
	public Info(long u, int p){
		used = u;
		power = p;
	}
}

class Node{
	int id;
	String name;
	long next;
	int power;
	ArrayList<Node> edge = new ArrayList<Node>();
	ArrayList<String> names = new ArrayList<String>();
	public Node(int id, String name, int power){
		this.id = id;
		this. name = name;
		this.power = power;
		next |= 1L<<id;
	}
	
	public void createEdge(Node nd){
		edge.add(nd);
		next |= 1L<<nd.id;
	}
}