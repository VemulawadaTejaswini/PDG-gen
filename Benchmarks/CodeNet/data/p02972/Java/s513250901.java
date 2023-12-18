import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	
	static int []cnt;
	static int []a;
	static ArrayList<Integer>ans;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		a = new int [n];
		cnt = new int [n];
		
		for(int i = 0 ;i < n ;i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		
		ans = new ArrayList<Integer>();
		
		for(int i = n-1 ; i >= 0 ;i--) {
			if(cnt[i] % 2 != a[i] ) {
				gcd(n,i+1);
				ans.add(i+1);
			}
		}
		
			System.out.println(ans.size());
			for(int i = 0 ;i < ans.size() ;i++) {
				System.out.println(ans.get(i));
			}
		}
	
	
	static void gcd(int n,int k) {
		for(int i = 2; k * i <= n ;i++) {
			if(cnt[k*i-1]%2 != a[k*i-1]) {
				cnt[k*i-1]++;
				if(!ans.contains(k*i)) {
				ans.add(k*i);
				}
			}
		}
	}

}
