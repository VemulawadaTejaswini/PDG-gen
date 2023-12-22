import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int[][] ground = new int[3][10];
		int[][] second = new int[3][10];
		int[][] third = new int[3][10];
		int[][] forth = new int[3][10];

		int[][][] all = {ground,second,third,forth};

		for(int l = 0; l<N; l++){
			String[] set = br.readLine().split(" ");
			int b = Integer.parseInt(set[0])-1;
			int f = Integer.parseInt(set[1])-1;
			int r = Integer.parseInt(set[2])-1;
			int v = Integer.parseInt(set[3]);

			all[b][f][r] += v;
		}

		for(int i = 0; i < all.length; i++){
			for(int j = 0; j < all[i].length; j++) {
				for(int k = 0; k < all[i][j].length; k++) {
					System.out.print(" " + all[i][j][k]);
				}
				System.out.print("\n");
			}
			if (i != 3) {
				System.out.print("####################\n");
			}
		}

	}

}