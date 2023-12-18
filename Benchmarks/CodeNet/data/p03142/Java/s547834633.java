
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	Map<Integer, Set<Integer>> map = new HashMap<Integer,Set<Integer>>();
	Map<Integer, Set<Integer>> inv = new HashMap<Integer,Set<Integer>>();

	void run() {
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		Set<Integer> isParent = new HashSet<Integer>();
		for(int i =0 ; i < n ; i++){
			isParent.add(i+1);
		}
		
		for(int i = 0; i < n+m-1;i++){
			int a  =sc.nextInt();
			int b = sc.nextInt();
			
			map.computeIfAbsent(a, __ -> new HashSet<Integer>()).add(b);
			inv.computeIfAbsent(b, __ -> new HashSet<Integer>()).add(a);
			
			isParent.remove(b);
		}
		
		int root = isParent.toArray(new Integer[0])[0];
		
		int ans[] = new int[n];
		search(ans,root,0);
		
		for(int i =0 ; i < n ; i++){
			System.out.println(ans[i]);
		}
	}
	
	void search(int[] ans, int initnow, int initparent ){

		List<int[]> children = new LinkedList<int[]>();
		children.add(new int[]{initnow,initparent});
		
		
		for(;!children.isEmpty();){
			int[] n = children.remove(0);
						
			int now = n[0];
			int parent = n[1];
			
//			System.out.println(now+" "+parent);
			
			ans[now-1] = parent;
			
			for(int child : map.getOrDefault(now,new HashSet<Integer>())){
				if(inv.get(child).size() != 1){
					inv.get(child).remove(now);
//					System.out.println(" remove "+child+" : "+now);
				}else{
					children.add(new int[]{child,now});
				}			
			}
			
		}
		
		return ;
		
	}
}
