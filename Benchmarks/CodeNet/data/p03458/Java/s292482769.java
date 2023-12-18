
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		int k=sc.nextInt();

		int c[][] = new int[2*k][2*k];
		for(int i=0; i<n; i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			if(sc.next().charAt(0)!='B') {
				x+=k;
			}
			x %= 2*k;
			y %= 2*k;
			c[x][y]++;
		}

		int s[][] = new int[2*k+1][2*k+1];
		s[0][0]=0;
		for(int i=0; i<2*k; i++) {
			for(int j=0; j<2*k; j++) {
				s[i+1][j+1] = s[i+1][j] + s[i][j+1] - s[i][j] + c[i][j];
			}
		}

		long max = 0;
		for(int i=0; i<k; i++) {
			for(int j=0; j<k; j++) {
				int tmp1 = s[i][j];
				int tmp2 = s[2*k][j] - s[i+k][j];
				int tmp3 = s[i][2*k] - s[i][j+k];
				int tmp4 = s[i+k][j+k] - s[i][j+k] - s[i+k][j] + s[i][j];
				int tmp5 = s[2*k][2*k] - s[2*k][j+k] - s[i+k][2*k] + s[i+k][j+k];
				int tmp = tmp1+tmp2+tmp3+tmp4+tmp5;
				max = Math.max(max, tmp);
				max = Math.max(max, n-tmp);
			}
		}
		System.out.println(max);
		sc.close();
	}
}
