import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
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
			list.add(1);
			int now = 1;
			
			for(int i = 0 ; i <= n ;i++) {
				now = a[now];
				if(list.contains(now)) {
					break;
				}
				list.add(now);
			}
			int cnt = 0;
			int mod = 0;
			for(int i = 0 ; i <= list.size() ;i++) {
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
