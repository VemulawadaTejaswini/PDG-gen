import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int AB = scan.nextInt();
		int X = scan.nextInt();
		int Y = scan.nextInt();
		System.out.println(search(A,B,AB,X,Y));
	}

	public static int search(int A,int B,int AB,int X,int Y) {
		int ans = Integer.MAX_VALUE;
		int I = X>Y? X : Y;

		for(int i = 0; i <= I; i++) {
			for(int a = 0; a <= (X - i); a++) {
				for(int b = 0; b <= (Y - i); b++) {
					if (((i + a) < X) || ((i + b) < Y)) continue;
					ans = Math.min(ans,a*A + b*B + 2*i*AB);
				}
			}
		}
		return ans;
	}
}
