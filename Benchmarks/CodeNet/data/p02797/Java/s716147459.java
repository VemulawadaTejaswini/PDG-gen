import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int K = stdIn.nextInt();
		int S = stdIn.nextInt();
		
		int len = N-(K-1);
		int a = S/(len);
		int b = S-a*(len-1);
		
		for(int i = 0; i < N; i++) {
			if((i+1)%len == 0) {
				System.out.println(b);
			}
			else {
				System.out.println(a);
			}
		}

	}

}