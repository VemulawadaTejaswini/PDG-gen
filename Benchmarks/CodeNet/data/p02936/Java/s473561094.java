import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); int q = sc.nextInt();
		int[] counter = new int[n];
		int[] height = new int[n];
		int[][] edge = new int[n][n];
		int a = 0; int b = 0;

		for(int i = 0; i < n-1; i++) {
			a = Integer.parseInt(sc.next());
			b = Integer.parseInt(sc.next());
			edge[a-1][b-1] = 1; edge[b-1][a-1] = 1;
		}

		height[0] = 1;

		for(int i = 0; i < n ; i++){
			if (edge[0][i] == 1) {
				height[i] = 2;
				height= checkheight(height, edge, i, n);
			}
		}

		for(int i = 0; i< q; i++) {
			int p = Integer.parseInt(sc.next());
			int x = Integer.parseInt(sc.next());
			counter = count(edge, height,counter, p-1, x, n);
		}

		System.out.print(Arrays.toString(counter));

		sc.close();
	}

	public static int[] checkheight(int[] height, int[][] edge, int i, int n) {
		for(int j = 0; j < n; j++) {
			if(edge[i][j] == 1) {
				if(height[j] == 0){
					height[j] = height[i]+1;
					height = checkheight(height, edge, j,n);
				}
			}
		}
		return height;
	}
	public static int[] count(int[][] edge, int[] height,int[]counter, int p, int x, int n) {
		counter[p] += x;
		for(int i = 0; i < n; i++) {
			if(edge[p][i] == 1 && height[p] < height[i]) {
				counter = count(edge, height, counter, i,x,n);
			}
		}
		return counter;
	}
}