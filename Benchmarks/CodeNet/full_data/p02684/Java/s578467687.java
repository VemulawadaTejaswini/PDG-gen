
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		long k = Long.parseLong(sc.next());
		
		int []a = new int [n+1];
		
		for(int i = 0 ; i < n ;i++) {
			a[i+1] = Integer.parseInt(sc.next());
		}	
		
		int now = 1;
		List <Integer> list = new ArrayList <Integer>();
		Set <Integer> set = new HashSet<Integer>();
		list.add(now);
		set.add(now);
		
		int cnt = 0;
		while(cnt <= n) {
			int next = a[now];
			if(set.contains(next)) {
				list.add(next);
				break;
			}
			set.add(next);
			list.add(next);
			now = next;
			cnt++;
		}
		
		int m = list.size();
		int id = -1;
		int last = list.get(m-1);
		
		
		for(int i = 0 ; i < m ; i++) {
			if(last == list.get(i)) {
				id = i;
				break;
			}
		}
		
		int mod = m - id - 1;
		int []ren = new int [mod];
		for(int i = id ; i < m-1  ;i++) {
			ren[i-id] = list.get(i);
		}
		
		k = (long)k - id;
		int p = (int) k % mod;
		
		System.out.println(ren[p]);
		
	}

}
