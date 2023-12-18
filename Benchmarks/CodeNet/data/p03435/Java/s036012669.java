import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int[][] c = new int [3][3];
		for (int i = 0;i < 3; ++i){
			for (int k = 0;k < 3; ++k){
				c[i][k] = Integer.parseInt(scan.next());
			}
		}

		int[] x = new int [3];
		int[] y = new int [3];
		x[0] = 0;

		for (int i = 0;i < 3; ++i){
			y[i] = c[0][i]-x[0];
		}

		for (int i = 0;i < 3; ++i){
			x[i] = c[i][0]-y[0];
		}
		boolean ok = true;
		for (int i = 0;i < 3; ++i){
			for (int k = 0;k < 3; ++k){
				if (c[i][k] != x[i]+y[k]){
					ok = false;
				}
			}
		}

		System.out.print(ok?"Yes":"No");
	}
}

//end