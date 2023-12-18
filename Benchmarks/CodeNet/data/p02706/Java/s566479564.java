import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int sum = 0;
		for(int i = 0; i < m; i++) {
			sum += sc.nextInt();
		}

		if(0 <= n - sum) {
			System.out.println(n - sum);
		}else {
			System.out.println(-1);
		}
		sc.close();
	}
	
}