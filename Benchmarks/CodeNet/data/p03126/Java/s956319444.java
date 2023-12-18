import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int count = 0;
		for(int i =0; i < n; i++) {
			int k = sc.nextInt();
			if(k >= n) {
				count += k / n;
			}
			for(int j = 0; j < k; j++)
				sc.nextInt();
				
				
		}
		
		System.out.println(count);
		
	}
}