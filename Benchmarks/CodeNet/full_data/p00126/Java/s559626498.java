
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int[] dx = {0,1,2,0,1,2,0,1,2};
	int[] dy = {0,0,0,1,1,1,2,2,2};
	int[] dz1 = {0,3,6,0,3,6,0,3,6};
	int[] dz2 = {0,0,0,3,3,3,6,6,6};
	void run() {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=0;i<n;i++) {
			int[][] np = new int[9][9];
			boolean[][] fnp = new boolean[9][9];
			for(int j=0;j<9;j++) for(int k=0;k<9;k++) np[j][k] = sc.nextInt();
			for(int j=0;j<9;j++) for(int k=0;k<9;k++) for(int l=k+1;l<9;l++) {
				if( np[j][k] == np[j][l] ) fnp[j][k] = fnp[j][l] = true;
				if( np[k][j] == np[l][j] ) fnp[k][j] = fnp[l][j] = true;
				if( np[dz2[j]+dy[k]][dz1[j]+dx[k]] == np[dz2[j]+dy[l]][dz1[j]+dx[l]] )
					fnp[dz2[j]+dy[k]][dz1[j]+dx[k]] = fnp[dz2[j]+dy[l]][dz1[j]+dx[l]] = true;
			}
			for(int j=0;j<9;j++) {
				for(int k=0;k<9;k++) {
					if(fnp[j][k]) System.out.print("*");
					else System.out.print(" ");
					System.out.print(np[j][k]);
				}
				System.out.println();
			}
			if(i+1!=n)
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}