import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		int []c = new int [n];
		int []s = new int [n];
		int []f = new int [n];
		
		for(int i = 0 ;i < n-1 ;i++) {
			c[i] = Integer.parseInt(sc.next());
			s[i] = Integer.parseInt(sc.next());
			f[i] = Integer.parseInt(sc.next());
		}
		int []t = new int [n];
		for(int i = 0 ;i < n-1 ;i++) {
			t[i] = 0;
			for(int j = i ; j < n-1 ;j++) {
				if(t[i] < s[j])
					t[i] = s[j] + c[j];
				else {
					if(t[i]%f[j] == 0) {
						t[i] += c[j];
					}
					else {
						int temp = t[i] % f[j];
						t[i] += (s[i] - temp) + c[j];
					}
					
				}
			}
		}
		
		t[n-1] = 0;
		
		for(int i = 0 ; i < n; i++) {
			System.out.println(t[i]);
		}
	}
}
