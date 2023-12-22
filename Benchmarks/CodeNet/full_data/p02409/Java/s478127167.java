import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


// 公舎の入居者数
public class Main {

	private static int inputRecord;
	private static int[][][] houseInfo = { { {0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } },
														  { {0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } },
														  {	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } },
														  { {0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } } };

	public static void main(String [] args) {
		
		// input
		getInfo();
		
		// output
		printInfo();
		
	}
	
	// input
	public static void getInfo() {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			// 入力件数
			inputRecord = Integer.parseInt(br.readLine());
			// 各棟の情報
			for (int i = 0; i < inputRecord; i++) {
				String[] baseInfo = br.readLine().split(" ");
 				int b = Integer.parseInt(baseInfo[0]) - 1; // 棟
 				int f = Integer.parseInt(baseInfo[1]) - 1; // 階
 				int r = Integer.parseInt(baseInfo[2]) - 1; // 部屋
 				int v = Integer.parseInt(baseInfo[3]); // 人数
				// 現在の人数
				int currentV = houseInfo[b][f][r];
				int  newV= currentV + v;
				if (newV < 0 || newV > 9) {
					System.out.printf("入居者数が不正です。（０人より少ないor９人より多い）\n");
					return;
				}
				houseInfo[b][f][r] = newV;
			}
		} catch (IOException e){
			System.out.println(e);
		}
	}

	// output
	public static void printInfo() {
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 10; k++) {
						System.out.printf(" %d",houseInfo[i][j][k]);
				}
				System.out.printf("\n");
			}
			if (i < 3) {
				System.out.printf("####################\n");
			}
		}
	}
}
