
import java.util.Scanner;

public class Main {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int []a = new int [3];
		
		int sum = 0;
		
		for(int i = 0 ; i < 3 ;i++) {
			a[i] = Integer.parseInt(sc.next());
			sum += a[i];
		}	
		
		
		String []s = new String [n];
		
		for(int i = 0 ; i < n ;i++) {
			s[i] = sc.next();
		}
		
		if(sum == 0) {
			System.out.println("No");
			return;
		}
		
		char []c = new char [n];
		
		for(int i = 0 ; i < n ;i++) {
			int p = s[i].charAt(0) - 'A';
			int q = s[i].charAt(1) - 'A';
			
			if(a[p] == 0 && a[q] == 0) {
				System.out.println("No");
				return;
			}
			
			if(i != n-1 && a[p] == a[q]) {
				int pn = s[i+1].charAt(0);
				int qn = s[i+1].charAt(1);
				if(p != pn && p != qn) {
					a[p]--;
					a[q]++;
					c[i] = (char)('A' + q);
				}
				else if(q != pn && q != qn) {
					a[p]++;
					a[q]--;
					c[i] = (char)('A' + p);
				}
			}
			
			else {
				if(a[p] > a[q]) {
					a[p]--;
					a[q]++;
					c[i] = (char)('A' + q);
				}
				else {
					a[p]++;
					a[q]--;
				c[i] = (char)('A' + p);
				}
			}
		}
		
		System.out.println("Yes");
		for(int i = 0 ; i < n ;i++) {
			System.out.println(c[i]);
		}		
	
	}

}
