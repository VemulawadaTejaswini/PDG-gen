import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		int[] order = new int[n];
		
		for(int i = 0; i < n; i++) {
			order[i] = i+1;
		}
		
		int [] Order = new int[n];
		for(int i = 0; i < n; i++) {
			if(i==n-1) {
				Order[i] = 1;
			}else {
				
				Order[i] = i+2;
			}
		}
		
		int max = 0;
		
		for(int i = 0; i < n; i++) {
			max += order[i] % Order[i];
		}
		System.out.println(max);
	}

}
