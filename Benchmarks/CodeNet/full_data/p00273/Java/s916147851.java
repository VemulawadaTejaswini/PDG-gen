import java.util.Scanner;
public class Main {
	void doIt() {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();

		for(int r = 0; r < n; r++) {
			int bath = stdIn.nextInt();
			int pool = stdIn.nextInt();
			int bathN = stdIn.nextInt();
			int poolN = stdIn.nextInt();
			int ans1, ans2;
			if(bathN >= 5 && poolN >= 2) {
				System.out.println((int)((bath * bathN) + (pool * poolN)) * 0.8); 
			} else {
				if(bathN >= 5 && poolN < 2) {
					ans1 = (bath * bathN) + (pool * poolN);
					poolN = 2;
					ans2 = (int)(((bath * bathN) + (pool * poolN)) * 0.8); 
					System.out.println((int)Math.min(ans1, ans2));
				} else if(bathN < 5 && poolN >= 2) {
					ans1 = (bath * bathN) + (pool * poolN);
					bathN = 5;
					ans2 = (int)(((bath * bathN) + (pool * poolN)) * 0.8);
					System.out.println((int)Math.min(ans1, ans2));
				} else {
					ans1 = (bath * bathN) + (pool * poolN);
					bathN = 5;
					poolN = 2;
					ans2 = (int)(((bath * bathN) + (pool * poolN)) * 0.8);
					System.out.println((int)Math.min(ans1, ans2));
				}
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().doIt();
	}

}