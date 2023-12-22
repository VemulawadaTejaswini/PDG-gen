import java.util.Scanner;

public class Main {
	void run() {
		// ??\???
		int n; 
		int[] arr = new int[10];
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
//		int[] ans = new int[n];
		for( int i = 0; i < n; i++ ) {
			// ??± 
			int box1 = 0, box2 = 0;
			for( int j = 0; j < 10; j++ ) {
				arr[j] = scan.nextInt();
			}
			// ??????
			for( int j = 0; j < 10; j++ ) {
				if( arr[i] > box1 ) box1 = arr[i];
				else if( arr[i] > box2 ) box2= arr[i];
				else {
//					ans[i] = -1;
					System.out.println("NO");
					break;
				}
				if( j == 9 ) {
//					ans[i] = 1;
					System.out.println("YES");
				}
			}
		}
//		for( int i = 0; i < n; i++ ) {
//			if( ans[i] == 1 ) System.out.println("YES");
//			else System.out.println("NO");
//		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}