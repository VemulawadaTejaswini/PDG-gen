import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static final int BIG_NUM  = 2000000000;
	public static final int MOD  = 1000000007;

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String work[] = new String[4];
		int table[][][] = new int[4][3][10];

		for(int a = 0; a < 4; a++){
			for(int b = 0; b < 3; b++){
				for(int c = 0; c < 10; c++)table[a][b][c] = 0;
			}
		}

		try {
			int N = Integer.parseInt(br.readLine());

			for(int loop = 0; loop < N; loop++){
				work = br.readLine().split("\\s+");
				table[Integer.parseInt(work[0])-1][Integer.parseInt(work[1])-1][Integer.parseInt(work[2])-1] += Integer.parseInt(work[3]);
			}


			print(table[0]);
			for(int i = 1; i <= 3; i++){
				System.out.printf("####################\n");
				print(table[i]);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void print(int house[][]){

		for(int row = 0; row < 3; row++){
			for(int col = 0; col < 10; col++){
				System.out.printf(" %d", house[row][col]);
			}
			System.out.printf("\n");
		}
	}
}


