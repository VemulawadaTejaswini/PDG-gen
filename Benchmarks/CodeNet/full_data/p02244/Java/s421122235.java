import java.util.Scanner;

public class Main {

	public enum Type{
		Queen,
		Not,
		Undefined,
	}

	public static final int BIG_NUM = 2000000000;
	public static final int MOD = 1000000007;

	public static final int H = 8;
	public static final int W = 8;
	public static final int num_diff = 8;

	public static final int diff_row[] = {-1,-1,-1,0,0,1,1,1};
	public static final int diff_col[] = {-1,0,1,-1,1,-1,0,1};

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Type first[][] = new Type[8][8];

		for(int row = 0; row < H; row++){
			for(int col = 0; col < W; col++){
				first[row][col] = Type.Undefined;
			}
		}

		int N = scanner.nextInt();
		int tmp_row,tmp_col;

		for(int loop = 0; loop < N; loop++){

			tmp_row = scanner.nextInt();
			tmp_col = scanner.nextInt();

			paint(first,tmp_row,tmp_col);
		}

		recursive(0,0,first,N);
	}

	//table[row][col]にあるQueenの経路を塗る
	public static void paint(Type table[][],int row,int col){

		table[row][col] = Type.Queen;

		int tmp_row,tmp_col;

		for(int i = 0; i < num_diff; i++){

			tmp_row = row+diff_row[i];
			tmp_col = col+diff_col[i];

			while(rangeCheck(tmp_row,tmp_col)){

				table[tmp_row][tmp_col] = Type.Not;

				tmp_row += diff_row[i];
				tmp_col += diff_col[i];

			}
		}
	}

	//table[row][col]にQueenを置けるか調べる
	public static boolean is_ok(Type table[][],int row,int col){

		//未定義マスでなければfalse
		if(table[row][col] != Type.Undefined)return false;

		int tmp_row,tmp_col;

		//他のQueenと衝突するか調べる
		for(int i = 0; i < num_diff; i++){

			tmp_row = row+diff_row[i];
			tmp_col = col+diff_col[i];

			while(rangeCheck(tmp_row,tmp_col)){

				if(table[tmp_row][tmp_col] == Type.Queen){
					return false;
				}

				tmp_row += diff_row[i];
				tmp_col += diff_col[i];
			}
		}
		return true;
	}

	public static void recursive(int base_row,int base_col,Type table[][],int put_num){

		if(put_num == 8){

			for(int row = 0; row < H; row++){
				for(int col = 0; col < W; col++){

					if(table[row][col] == Type.Queen){

						System.out.print("Q");

					}else{
						System.out.printf(".");
					}
				}
				System.out.print("\n");
			}
			return;
		}

		//置かないで次へ
		if(base_col == 7){
			if(base_row == 7)return;

			recursive(base_row+1,0,table,put_num);

		}else{
			recursive(base_row,base_col+1,table,put_num);
		}

		//置けるなら置く
		if(is_ok(table,base_row,base_col)){

			Type next[][] = new Type[8][8];
			for(int row = 0; row < H; row++){
				for(int col = 0; col < W; col++){
					next[row][col] = table[row][col];
				}
			}
			paint(next,base_row,base_col);

			if(base_col == 7){

				if(base_row == 7){
					return;
				}else{
					recursive(base_row+1,0,next,put_num+1);
				}

			}else{
				recursive(base_row,base_col+1,next,put_num+1);
			}
		}
	}

	public static boolean rangeCheck(int row,int col){

		if(row >= 0 && row <= H-1 && col >= 0 && col <= W-1){
			return true;
		}else{
			return false;
		}
	}
}

