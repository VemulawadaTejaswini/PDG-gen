import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		int a = stdIn.nextInt();
		
		int b = stdIn.nextInt();
		
		long cnt = 0;
		
		for(long i = 1; i <= n; i++) {
			if(i == a || i == b) {
				continue;
			}else {
				cnt += ((i * (i-1)) % (1e9+7))/2 % (1e9+7);
			}
			
		}
		System.out.println(cnt);
	}

}
