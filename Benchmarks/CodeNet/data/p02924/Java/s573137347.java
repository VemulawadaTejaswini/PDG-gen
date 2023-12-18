import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		int[] order = new int[n];
		
		for(int i = 0; i < n; i++) {
			order[i] = i+1;
		}
		
		int [] Orderb = new int[n];
		for(int i = 0; i < n; i++) {
			if(i==n-1) {
				Orderb[i] = 1;
			}else {
				
				Orderb[i] = i+2;
			}
		}
		
		long max = 0;
		
		for(int i = 0; i < n; i++) {
			max += order[i] % Orderb[i];
		}
		System.out.println(max);
	}

}
