import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		long half = ((long)k)/2;
		
		int left = 0;
		int right = k ;
		int ans =0;
		
		for (int i = 0; i < n; i++) {
			int x = scanner.nextInt();
			
			if ((long)x<half) {
			
					ans+=x*2;
			
			}else {
			
					ans+= (k-x)*2;
			
			}
		}
		
		System.out.println(ans);
		
		scanner.close();
	}

}
