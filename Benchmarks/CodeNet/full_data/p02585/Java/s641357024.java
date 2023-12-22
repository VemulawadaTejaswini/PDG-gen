
import java.util.Scanner;

public class Main {
	
	static long inf = 100000000000000L*-1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		
		int []p = new int [n];
		int []c = new int [n];
		
		for(int i = 0 ; i < n ;i++) {
			p[i] = Integer.parseInt(sc.next());
		}
		
		for(int i = 0 ; i < n ;i++) {
			c[i] = Integer.parseInt(sc.next());
		}
		
		long [][]d = new long [n][n+1];
		int []len = new int [n];
		long max = inf;
		
	 for(int i = 0 ; i < n ;i++) {
			boolean []visit = new boolean [n];
			visit[i] = true;
			int now = i;
			int next = i;
			for(int j = 0 ; j < n ;j++) {
				now = next;
				next = p[now]-1;
				if(now == next && j ==0) {
					break;
				}
				len[i]++;
				d[i][j+1] = d[i][j] + c[next];
				visit[now] = true;
				
				if(visit[next]) {
					break;
				}
				
			}
			
			for(int j = 1 ; j <= len[i] ; j++) {
				max = Math.max(d[i][j], max);
			}
			if(d[i][len[i]] > 0 && k > len[i]) {
				int l = k%len[i];
				for(int j = 0 ; j <= l ;j++) {
					max = Math.max(max,(d[i][len[i]]*(k/len[i])+d[i][j]));
					
				}
			}
		}
		System.out.println(max);
		}
}


