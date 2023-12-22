import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long num = 0;
		long ans = 1;
		long num2 = 1000000000000000000L;
 
		
		for(int i = 0; i < n; i++) {
			num = sc.nextLong();
			ans = ans * num;
		}
		
		if(ans > num2) {
			System.out.println(-1);
			return;
		}
		System.out.println(ans);
 
	}
}