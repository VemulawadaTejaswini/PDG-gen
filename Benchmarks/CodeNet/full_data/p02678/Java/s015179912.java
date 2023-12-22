import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		List<Integer>[] arrow = new ArrayList[n];
		for(int i = 0; i < n; i++)arrow[i] = new ArrayList<>();
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			arrow[a].add(b);
			arrow[b].add(a);
		}
		if(!arrow[0].isEmpty()) {
			Queue<Integer> q = new ArrayDeque<>();
			q.add(0);
			int ans[] = new int[n];
			int count = 1;
			while(!q.isEmpty()) {
				int now = q.poll();
				while(!arrow[now].isEmpty()) {
					int next = arrow[now].remove(0);
					if(ans[next]==0) {
						ans[next]+=count;
					}
					else {
						ans[next] = Math.min(count, ans[next]);
					}
					q.add(next);
				}
				count++;
			}
			System.out.println("Yes");
			for(int i = 1; i < n; i++) {
				if(ans[i]!=0)System.out.println(ans[i]);
			}
		}
		else {
			System.out.println("No");
		}
	 }
}