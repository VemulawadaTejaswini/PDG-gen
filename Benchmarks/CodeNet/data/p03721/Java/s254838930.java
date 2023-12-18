import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int k = stdIn.nextInt();
		
		long cnt = 0;
		for(int i = 0; i < n; i++) {
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			
			cnt+=b;
			if(cnt>=k) {
				System.out.println(a);
				return;
			}
			
			
			
			
		}
		
		
	}

}
