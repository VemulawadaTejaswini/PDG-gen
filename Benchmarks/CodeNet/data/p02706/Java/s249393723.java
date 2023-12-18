import java.util.Scanner;

public class  Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = new java.util.Scanner(System.in).nextInt();
		int m = new java.util.Scanner(System.in).nextInt();
		int sum = n;
		
		for(int i = 1; i <= m; i++) {
			int am = new java.util.Scanner(System.in).nextInt();
			
			sum = sum - am;
		}
		
		if(sum >= 0) {
		System.out.print(sum);
		}
		else if(sum < 0) {
			System.out.print(-1);
		}
	}
}