import java.util.*;

public class Main {
	Scanner sc;
	
	void run() {
		sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0) break;
			
			int[] a = new int[n];
			for (int i=0;i<n;i++) {
				a[i] = sc.nextInt();
			}
			
			int sum;
			int correct = Integer.MIN_VALUE;
			
			for (int i=0;i<n-1;i++) {
				sum = a[i];
				for (int j=i+1;j<n;j++) {
					sum += a[j];
					if (sum > correct)
						correct = sum;
				}
			}
			
			System.out.println(correct);
		}
	}
	
	
	public static void main(String[] args){
		new Main().run();
	}
}