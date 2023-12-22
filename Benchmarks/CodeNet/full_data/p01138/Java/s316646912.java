import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> al = new ArrayList<>();
		
		int n, aliveSec, departSec, ans; 
		int[] S = new int[86400];
		
		while((n = sc.nextInt()) != 0) {
			int begin = Integer.MAX_VALUE, end = Integer.MIN_VALUE;
			
			for(int i = 0; i < n; i++) {
				
				String[] alive = sc.next().split(":");
				String[] depart = sc.next().split(":");
				
				aliveSec = Integer.parseInt(alive[0]) * 3600 + Integer.parseInt(alive[1]) * 60 + Integer.parseInt(alive[2]);
				departSec = Integer.parseInt(depart[0]) * 3600 + Integer.parseInt(depart[1]) * 60 + Integer.parseInt(depart[2]);
				
				S[aliveSec]++;
				S[departSec + 1]--;
				
				begin = Math.min(begin, aliveSec);
				end = Math.max(end, departSec);
			}
			
			ans = S[begin];
			for(int i = begin + 1; i <= end; i++) {
				S[i] += S[i - 1];
				
				ans = Math.max(ans, S[i]);
			}
			
			al.add(ans);
			
			S = new int[86400];
		}
		
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
	}
}