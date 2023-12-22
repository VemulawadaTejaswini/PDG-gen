import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count[][][] = new int[4][3][10];
		int i, j, k;
		int n = sc.nextInt();
		for(i = 0; i < n; i++) {
			int b = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			int v = sc.nextInt();
			
			count[b - 1][f - 1][r - 1] = v;
		}
		for(i = 0; i < 4; i++) {
			for(j = 0; j < 3; j++) {
				for(k = 0; k < 10; k++) {
					System.out.print(" " + count[i][j][k]);
				}
			System.out.println();
			}
		if(i != 3) System.out.println("####################");
		}
	}

}
