import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[][][] residence = new int[4][3][10];

		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String[] str = br.readLine().split(" ");
			int b = Integer.parseInt(str[0]);
			int f = Integer.parseInt(str[1]);
			int r = Integer.parseInt(str[2]);
			int v = Integer.parseInt(str[3]);
			residence[b - 1][f - 1][r - 1] += v;
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 10; k++) {
					System.out.print(" " + residence[i][j][k] );

				}
				System.out.print("\n");
			}
			
			if (i != 3) {
				System.out.println("####################");
			}

		}
	}
}
// for (int i=0;i<4;i++){
// for(int j=0;j<3;j++){
// for (int k=0;k<10;k++){
// sb.append(" ").append(residence[i][j][k]);
// }
// sb.("\n");
// }
// if (i !=4){
// System.out.print("##########");
// }