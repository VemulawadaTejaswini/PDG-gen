import java.util.Scanner;

public class Main {
	void run(){
		int n, x;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int[] ans = new int[n];
		for( int i = 0; i < n; i++ ) {
			int box1 = 0, box2 = 0;
			for( int j = 1; j < 10; j++ ) {
				x = scan.nextInt();
				if( j == 0 ) box1 = x;
				if( x > box1 ) box1 = x;
				else if( x > box2 ) box2= x;
				else {
					System.out.println("NO");
					break;
				}
				if( j == 9 ) {
					System.out.println("YES");
				}
			}
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}