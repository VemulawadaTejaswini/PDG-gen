import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		
		int n = stdIn.nextInt();
		int[]a = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt(); //それぞれのたこやきの回復量
		}
		int sum = 0;
		for(int i = 0; i < n-1; i++) {
			for(int j = i+1; j < n; j++) {
				sum+= a[i]*a[j];
			}
		}
		
		System.out.println(sum);
		
		
	}

}
