
import java.util.Scanner;

public class Main {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int []a = new int [3];
		for(int i = 0 ; i < 3 ;i++) {
			a[i] = Integer.parseInt(sc.next());
		}
				
		
		int []cnt = new int [3];
		char []d = new char [n];
		
		for(int i = 0 ; i < n ;i++) {
			String s = sc.next();
			int p = s.charAt(0) - 'A';
			int q = s.charAt(1) - 'A';
			if(cnt[p] == cnt[q]) {
				if(a[p] == 0 && a[q] == 0) {
					System.out.println("No");
					return;
				}
				if(a[p] > a[q]) {
					cnt[p]--; cnt[q]++; a[p]--; a[q]++;
					d[i] = (char)(q + 'A');
				}
				else {
					cnt[p]++;cnt[q]--; a[p]++; a[q]--;
					d[i] = (char)(p + 'A');
				}
			}
			else {
				if(a[p] == 0 && a[q] == 0) {
					System.out.println("No");
					return;
				}
				if(cnt[p] > cnt[q]) {
					cnt[p]--; cnt[q]++;
					a[p]-- ; a[q]++;
					d[i] = (char)(q + 'A');
				}
				else {
					cnt[p]++; cnt[q]--;
					a[p]++; a[q]--;
					d[i] = (char)(p + 'A');
				}
			}
			
		}
		
		System.out.println("Yes");
		for(int i = 0 ; i < n ;i++) {
			System.out.println(d[i]);
		}
	}

}
