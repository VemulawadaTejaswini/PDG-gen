import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		if (K % 2 == 1) {
			long count = 0;
			for (int i = 1; i <= N; i++) {
				if (i % K == 0) {
					count++;
				}
			}
			
			System.out.println(count * count * count);
		} else {
			long ans = 0;
			
			long count = 0;
			for (int i = 1; i <= N; i++) {
				if (i % K == 0) {
					count++;
				}
			}
			
			ans += count * count * count;
			
			count = 0;
			for (int i = 1; i <= N; i++) {
				if (i % K == K / 2) {
					count++;
				}
			}
			
			ans += count * count * count;
			
			
			
			System.out.println(ans);
		}
	}
}