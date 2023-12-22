import java.util.Scanner;

public class Main {
	void run() {
		// 入力
		int n; 
		int[] arr = new int[10];
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
//		int[] ans = new int[n];
		for( int i = 0; i < n; i++ ) {
			// 箱 
			int box1 = 0, box2 = 0;
			for( int j = 0; j < 10; j++ ) {
				arr[j] = scan.nextInt();
			}
			// 判定
			for( int j = 0; j < 10; j++ ) {
				if( arr[j] > box1 ) box1 = arr[j];
				else if( arr[j] > box2 ) box2 = arr[j];
				else {
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
