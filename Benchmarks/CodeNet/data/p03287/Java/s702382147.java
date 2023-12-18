import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solve(new Scanner(System.in));
	}
	
	public void solve(Scanner sc) {
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		
		int[] a = new int[n];
		
		long sum = 0;
		
		long answer = 0;
		for(int i=0; i<n; i++) {
			a[i] = Integer.parseInt(sc.next());
			sum += a[i];
			if(sum % m == 0) {
				answer++;
			}
		}
		
		for(int i=1; i<n; i++) {
			sum = 0;
			for(int j=i; j<n; j++) {
				sum += a[j];
				if(sum % m == 0) {
					answer++;
				}
			}
		}
		
		System.out.println(answer);
	}
}
