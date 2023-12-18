
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
public class Main {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int n = Integer.parseInt(sc.next());
			long m = Long.parseLong(sc.next());
			
			int []a = new int [n+1];
			
			for(int i = 0 ; i < n ;i++) {
				a[i+1] = Integer.parseInt(sc.next());
			}
			
			ArrayList <Integer> list = new ArrayList <Integer>();
			Set <Integer> set = new HashSet <Integer>();
			list.add(1);
			set.add(1);
			int now = 1;
			
			for(int i = 0 ; i <= n ;i++) {
				now = a[now];
				if(set.contains(now)) {
					break;
				}
				list.add(now);
				set.add(now);
			}
			
			int cnt = 0;
			int mod = 0;
			for(int i = 0 ; i <= n ;i++) {
				if(now == list.get(i)) {
					cnt = i;
					mod = list.size() - i;
					break;
				}
			}
			
			long temp = m - cnt;
			int ans = (int)temp % mod;
			
			System.out.println(list.get(cnt + ans));
			
		}

		
	}
