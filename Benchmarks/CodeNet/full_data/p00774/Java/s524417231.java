import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			int h = Integer.parseInt(br.readLine());

			if(h == 0){
				break;
			}

			int matrix[][] = new int[h][5];

			for(int i = h - 1; i >= 0; i--){
				String[] tmpArray = br.readLine().split(" ");
				for(int j = 0; j < 5; j++){
					matrix[i][j] = Integer.parseInt(tmpArray[j]);
				}
			}

			System.out.println(solve(matrix));
		}
	}

	static int solve(int[][] matrix){
		int score = 0;
		int h = matrix.length;
		while(true){
			if(matrix[0][0] == 0 && matrix[0][1] == 0 && matrix[0][2] == 0 && matrix[0][3] == 0 && matrix[0][4] == 0 ){
				break;
			}

			int tmpScore = 0;
			for(int i = 0; i < h; i++){
				int left = 0;
				int right = 0;
				for(int j = 0; j <= 2; j++){
					left = j;
					right = j;
					for(int k = j + 1; k < 5; k++){
						if(matrix[i][k] == matrix[i][j]){
							right = k;
						}
						else {
							break;
						}
					}
					//連鎖成立
					if(right - left >= 2){
						break;
					}
				}

				//連鎖処理
				if(right - left >= 2){
					for(int j = left; j <= right ; j++){
						tmpScore += matrix[i][j];
						matrix[i][j] = 0;
					}
				}

			}

//			System.out.println("befor");
//			show(matrix);
			//ドロップ処理
			if(h != 1){

				for(int j = 0; j < 5; j++){
					int target = 0;
					for(int k = 0; k < h; k++){
						if(matrix[k][j] != 0){
							matrix[target][j] = matrix[k][j];
//							System.out.println("k = "+k+" target = "+target);
							target++;
						}
					}

					for(int k = target; k < h ; k++){
						matrix[k][j] = 0;
					}
				}
			}

//			System.out.println("after");
//			show(matrix);
			if(tmpScore == 0){
				break;
			}
			else {
				score += tmpScore;
			}
		}

		return score;
	}

	//for debug
	static void show (int[][] matrix){
		for(int i = matrix.length - 1; i >= 0; i--){
			for(int j = 0; j < 5; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}

