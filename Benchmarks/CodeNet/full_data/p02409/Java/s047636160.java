import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		String[][] ground = new String[3][10];
		String[][] second = new String[3][10];
		String[][] third = new String[3][10];
		String[][] forth = new String[3][10];

		String[][][] all = {ground,second,third,forth};

		for(int i = 0; i < all.length; i++){
			for(int j = 0; j < all[i].length; j++) {
				for(int k = 0; k < all[i][j].length; k++) {
					all[i][j][k] = "0";
				}
			}
		}

		for(int l = 0; l<N; l++){
			String[] set = br.readLine().split(" ");
			all[Integer.parseInt(set[0])-1][Integer.parseInt(set[1])-1][Integer.parseInt(set[2])-1] = set[3];
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