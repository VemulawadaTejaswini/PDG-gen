
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[] c = new char[N];
		String line2 = sc.next();
		
		int K = sc.nextInt()-1;
		
		for(int i=0; i<N; i++) {
			c[i] = line2.charAt(i);
		}
		
		for(int i=0; i<N; i++) {
			if(c[K] != c[i]) {
				c[i] = '*';
			}
			System.out.print(c[i]);
		}
		System.out.println("");
		
		
	}
}