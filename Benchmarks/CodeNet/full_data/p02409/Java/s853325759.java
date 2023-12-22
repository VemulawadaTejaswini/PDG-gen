import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	    //件数の入力
		int a = scanner.nextInt();
		
		
		//棟、階、部屋で３次元配列arrayを作成
		int[][][] array = new int[4][3][10];
		
		
		//件数分繰り返し
		for (int i = 0; i < a; i++) {
			
			int b = scanner.nextInt();		//棟
			int f = scanner.nextInt();		//階
			int r = scanner.nextInt();		//部屋
			int v = scanner.nextInt();		//人数
			
			//人数を配列に代入
			array[b-1][f-1][r-1] += v;
		}
		
		
		//4棟分
		for (int i = 0; i < 4; i++) {
			
			//縦３
			for (int j = 0; j < 3; j++) {
				
				//横１０
				for (int k = 0; k < 10; k++) {
					System.out.print(" " + array[i][j][k]);		//配列arrayを出力
				}
				
				System.out.println();		//次の列へ
			}
			
			//最後以外表示
			if (i != 3)
				System.out.println("####################");
		}
	}
}
