import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[]h = new int[n];
		for(int i = 0; i < n; i++) {
			h[i] = stdIn.nextInt();
		}
		if(n==1) {
			System.out.println("Yes");
			System.exit(0);
		}
		
		for(int i = 0; i < n-1; i++) {
			if(h[i]-1>h[i+1]) {
				System.out.println("No");
				System.exit(0);
			}
		}
		System.out.println("Yes");
		
	}

}
