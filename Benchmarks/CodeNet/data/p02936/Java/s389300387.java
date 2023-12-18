
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
	
	static List<List<Integer>> list;
	static Integer n;
	static Integer q;
	static int []cnt;
	static int []ans;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 n = Integer.parseInt(sc.next());
		 q = Integer.parseInt(sc.next());
		
		 list = new ArrayList<>(n);
		 
		 for(int i = 0 ; i < n; i++) {
			 list.add(new ArrayList<>());
		 }
		 
		 for(int i = 0 ;i < n - 1 ;i++) {
			 int a = Integer.parseInt(sc.next());
			 int b = Integer.parseInt(sc.next());
			 list.get(a-1).add(b-1);
			 list.get(b-1).add(a-1);
		 }
		 
		  cnt = new int [n];
		 
		 for(int i = 0 ; i < q ;i++) {
			 int p = Integer.parseInt(sc.next());
			 int x = Integer.parseInt(sc.next());
			 
			 cnt[p-1] += x;
		 }
		 
		 sc.close();
		 
		 ans = new int [n];
		 
		 dfs(0, -1, 0);
		 
		 for(int i = 0 ;i < n ;i++) {
			 System.out.println(ans[i]);
		 }
		 

	}

	
	
	static void dfs(int to , int from , int sum ) {
		 sum += cnt[to];
		 ans[to] += sum;
		 
		 for(int next : list.get(to)) {
			 if(next != from)
				 dfs(next, to, sum);
		 }
		 
		 sum -= cnt[to];
		 
	}

	}
	
