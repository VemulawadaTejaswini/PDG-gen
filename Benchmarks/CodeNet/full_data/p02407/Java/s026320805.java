import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int j = n;
		int data[] = new int[n];
		int datax[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			data[i] = stdIn.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			datax[j - 1] = data[i];
			j--;
		}
		
		for(int i = 0; i < n; i++) {
			if( i == n - 1) {
				System.out.print(datax[i]);
			}else {
				System.out.print(datax[i] + " ");
			}
		}
	
	}
}
