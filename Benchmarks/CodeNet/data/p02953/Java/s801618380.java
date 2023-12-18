import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] H = new int[N];
		H[0] = sc.nextInt();
		boolean down = false;
		for(int i=1;i<N;i++) {
			H[i] = sc.nextInt();

			if(H[i-1] - H[i] > 2) {
				System.out.println("No");
				return;
			}else if(H[i-1] - H[i] == 1) {
				if(down) {
					System.out.println("No");
					return;
				}else {
					down = true;
				}
			}else if(H[i-1] - H[i] < 0) {
				down = false;
			}
		}
		System.out.println("Yes");
	}
}
