import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	private Scanner scan;

	public void mainrun() {
		scan = new Scanner(System.in);

		int n = 0;

		while((n = scan.nextInt()) != 0) {
			int[] h = new int[5];

			h[0] = n;
			for(int i = 1;i < h.length;i++) {
				h[i] = scan.nextInt();
			}

			boolean[] f = new boolean[3];
			Arrays.fill(f,false);

			for(int num : h) {
				f[num-1] = true;
			}

			int[] ans = new int [3];

			if(f[0] && f[1] && f[2] ||
				f[0] && !f[1] && !f[2] ||
				!f[0] && f[1] && !f[2] ||
				!f[0] && !f[1] && f[2]
			) {
				Arrays.fill(ans, 3);
			}else if(f[0] && f[1] && !f[2] ) {
				ans[0] = 1;
				ans[1] = 2;
			}else if(!f[0] && f[1] && f[2] ) {
				ans[1] = 1;
				ans[2] = 2;
			}else if(f[0] && !f[1] && f[2] ) {
				ans[2] = 1;
				ans[0] = 2;
			}

			for(int num : h) {
				System.out.println(ans[num-1]);
			}
		}
	}

}
