import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		long[] order = new long[n];
		
		for(int i = 0; i < n; i++) {
			order[i] = i+1;
		}
		
		long [] Order = new long[n];
		for(int i = 0; i < n; i++) {
			if(i==n-1) {
				Order[i] = 1;
			}else {
				
				Order[i] = i+2;
			}
		}
		
		long max = 0;
		
		for(int i = 0; i < n; i++) {
			max += order[i] % Order[i];
		}
		System.out.println(max);
	}

}
