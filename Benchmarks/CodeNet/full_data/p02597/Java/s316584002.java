import java.util.Scanner;
 
public class Main {
 
	static int ans;
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String c = sc.next();
		int w_count = 0;
		int r_count = 0;
		int count = 0;
		for(int i = 0; i < n; i++) {
			if(c.charAt(i) == 'W') {
				w_count++;
			}
		}
		int counta =0;
		if(n % 2 == 0) {
			counta =2/n + 1;
		}
		else {
			counta =2/n;
		}
		for(int i = n-1; i >counta;i--) {
			if(c.charAt(i) == 'R') {
				count++;
			}
		}
		r_count = n -w_count;
		int min = Integer.min(r_count, w_count);
		min = Integer.min(min, count);
		
		System.out.println(min);
			
	}
	
}