import java.util.*;

public class Main {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int M[][] = new int[H][W];
		boolean able = false;
		if(H/2 >= A && W/2 >= B) {
			able = true;
		}
		if (able) {
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) {
					M[i][j] = 0;
				}
			}
			for(int i = 0; i < A; i++) {
				for(int j = 0; j < B; j++) {
					M[i][j] = 1;
				}
			}
			for(int i = A; i < H; i++) {
				for(int j = B; j < W; j++) {
					M[i][j] = 1;
				}
			}
			for(int i= 0; i < H; i++) {
				System.out.println(Arrays.toString(M[i]));
			}
		}
	}
}
