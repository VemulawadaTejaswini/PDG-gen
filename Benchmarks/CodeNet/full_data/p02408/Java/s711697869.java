import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static final int BIG_NUM = 2000000000;
	public static final int MOD = 1000000007;

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean[][] table = new boolean[4][14];
		String mark[] = {"S","H","C","D"};

		for(int row = 0; row < 4; row++){
			for(int col = 1; col <= 13; col++){
				table[row][col] = false;
			}
		}


		try {
		   int N = Integer.parseInt(br.readLine());

		   for(int loop = 0; loop < N; loop++){

			   String input_str[] = br.readLine().split("\\s+");
			   table[get_row(input_str[0])][Integer.parseInt(input_str[1])] = true;
			}

		   for(int row = 0; row < 4; row++){
			   for(int col = 1; col <= 13; col++){
				   if(table[row][col])continue;

				   System.out.printf("%s %d\n", mark[row],col);
			   }
		   }


		} catch (NumberFormatException | IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

	private static int get_row(String str){

		switch(str){
		case "S":
			return 0;
		case "H":
			return 1;
		case "C":
			return 2;
		case "D":
			return 3;
		}
		return -1; //must not reach here
	}
}
