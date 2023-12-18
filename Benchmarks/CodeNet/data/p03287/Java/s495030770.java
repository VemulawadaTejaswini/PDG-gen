import java.util.ArrayList;
import java.util.List;
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
		
		long sumCopy = sum;
		for(int i=0; i<n-1; i++) {
			sumCopy -= a[i];
			if(sumCopy % m == 0) {
				answer++;
			}
		}
		
		for(int i=1; i<n-1; i++) {
			sum = 0;
			for(int j=i; j<n-1; j++) {
				sum += a[j];
				if(sum % m == 0) {
					answer++;
				}
			}
		}
		
		System.out.println(answer);
	}
}
