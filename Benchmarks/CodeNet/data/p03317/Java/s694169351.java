import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		n = n - k;
		int count = 1;
		
		if(n <= 0) {
			System.out.println(count);
			System.exit(0);
		}
		
		while(n > 0) {
			n = n - (k - 1);
			count++;
		}
		
		System.out.println(count);
		
		
	}
}