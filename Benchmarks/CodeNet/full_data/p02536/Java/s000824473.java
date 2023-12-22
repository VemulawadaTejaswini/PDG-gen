import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Set<Integer> set = new HashSet<Integer>();
		UnionFindTree tree = new UnionFindTree(n);
		for(int i = 0; i<n; i++) {
			tree.makeSet(i);
		}
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			tree.union(a, b);
		}
		for(int i = 0 ; i < n; i++) {
			set.add(tree.parent[i]);
		}
		System.out.println(set.size()-1);
	}
}