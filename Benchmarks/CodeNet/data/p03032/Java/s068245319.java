
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int p = Integer.parseInt(sc.next());
		
		int []a = new int [n];
		
		for(int i = 0 ;i < n ;i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		
		int temp = Math.min(n, p);
		long ans = 0;
		
		for(int k = 0 ; k <= temp ; k++) {
			for(int l = 0 ; l <= temp - k ; l++) {
				ArrayList <Integer> list = new ArrayList<Integer>();
				long temp1 = 0;
				for(int i = 0 ; i < k ; i++) {
					list.add(a[i]);
				}
				for(int j = 0 ; j < l ; j++) {
					list.add(a[n-j-1]);
				}
				if(list.isEmpty()) {
					continue;
				}
				Collections.sort(list);
				int r = temp - k - l;
				int cnt = 0;
				while(list.size() > 0 || list.get(0) < 0 || cnt < r) {
					list.remove(0);
					cnt++;
				}
				for(int num : list) {
					temp1 +=(long)num;
				}
				ans = Math.max(ans,temp1);
			}
		}
		System.out.println(ans);
				
	

	}
}
