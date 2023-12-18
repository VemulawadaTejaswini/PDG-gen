import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int m = stdIn.nextInt();
		
		int[] v = new int[m];
		Arrays.fill(v, -1);
		
		
		for(int i = 0; i < m; i++) {
			int s = stdIn.nextInt()-1;
			int c = stdIn.nextInt();
			
			if(v[s] < 0) {
				v[s] = c;
			}else if(v[s] != c) {
				System.out.println("-1");
				return;
			}
	
		}
		
		if(n > 1 && v[0] == 0) {
			System.out.println("-1");
			return;
		}
		
		for(int i = 0; i < n; i++) {
			if(v[i] >= 0) {
				System.out.print(v[i]);
			}else {
				if(i==0) {
					if(n == 1) {
						System.out.print("0");
					}else {
						System.out.print("1");
					}
				}else {
					System.out.print("0");
				}
				
				
				
				
			}
			
			
			
		}
		
		
	}

}
