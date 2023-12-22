import java.util.Scanner;

public class Main {
	void run() {
		int box1 = 0, box2 = 0;
		int n, num1 = 0, num2 = 0;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int[] arr = new int[10];
		for( int i = 0; i < n; i++ ) {
			for( int j = 0; j < 10; j++ ) {
				arr[j] = scan.nextInt();
				if( j == 0 ) box1 = arr[0];
			}
			for( int j = 1; j < 10; j++ ) {
				if( arr[j] > box1 ) box1 = arr[j];
				else if( arr[j] > box2 ) box2= arr[j];
				else {
					System.out.println("No");
					break;
				}
				if( j == 9 ) System.out.println("Yes");
			}
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}