import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

//D: Operations with Finite Sets
public class Main{

	static Set<Integer> u;
	static Set<Integer>[] set;
	static Map<String, Integer> ref;
	
	static char[] s;
	static int index;
	
	static char c(){
		return s[index++];
	}
	
	static Set<Integer> exp(){
		Set<Integer> ans = fac();
		while(index < s.length){
			char c = c();
			if(c=='u'){
				Set<Integer> e = fac();
				for(int a:e)ans.add(a);
			}
			else if(c=='i'){
				Set<Integer> e = fac();
				Set<Integer> tmp = new HashSet<Integer>();
				for(int a:e)if(ans.contains(a))tmp.add(a);
				ans = tmp;
			}
			else if(c=='d'){
				Set<Integer> e = fac();
				for(int a:e)ans.remove(a);
			}
			else if(c=='s'){
				Set<Integer> e = fac();
				Set<Integer> tmp = new HashSet<Integer>();
				for(int a:e)if(!ans.contains(a))tmp.add(a);
				for(int a:ans)if(!e.contains(a))tmp.add(a);
				ans = tmp;
			}
			else break;
		}
		return ans;
	}
	
	static Set<Integer> fac(){
		char c = c();
		if(c=='(')return exp();
		if(c=='c'){
			Set<Integer> ans = new HashSet<Integer>();
			ans.addAll(u);
			int id = ref.get(c()+"");
			for(int a:set[id])ans.remove(a);
			return ans;
		}
		return set[ref.get(c+"")];
	}
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			u = new HashSet<Integer>();
			set = new HashSet[5];
			ref = new HashMap<String, Integer>();
			int id = 0;
			while(true){
				String n = sc.next();
				int k = sc.nextInt();
				if(n.equals("R"))break;
				ref.put(n, id);
				set[id] = new HashSet<Integer>();
				while(k--!=0){
					int x = sc.nextInt();
					set[id].add(x);
					u.add(x);
				}
				id++;
			}
			s = (sc.next()+"$").toCharArray();
			index = 0;
			Set<Integer> a = exp();
			if(a.isEmpty())System.out.println("NULL");
			else {
				PriorityQueue<Integer> q = new PriorityQueue<Integer>();
				for(int i:a)q.add(i);
				boolean f = true;
				while(!q.isEmpty()){
					if(!f)System.out.print(" ");
					f = false;
					System.out.print(q.poll());
				}
				System.out.println();
			}
		}
	}
}