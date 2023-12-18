import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] t = new int[n];
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++) {
			t[i] = sc.nextInt();
			a[i] = sc.nextInt();
		}
		
		sc.close();
		
		long t_now = 0;
		long a_now = 0;
		
		for(int i = 0; i < n; i++) {
			long t_next = t[i];
			long a_next = a[i];
			while(t_next < t_now || a_next < a_now || t_next + a_next < t_now + a_now) {
				t_next += t[i];
				a_next += a[i];
			}
			t_now = t_next;
			a_now = a_next;
		}
		
		System.out.println(t_now + a_now);
		
		return;
	}
	
}