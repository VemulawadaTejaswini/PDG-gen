import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int lineNum = Integer.parseInt(br.readLine());
		int changeNum = Integer.parseInt(br.readLine());

		int[][] changer = new int[changeNum+1][lineNum+1];
		//?????????
		for(int i = 1; i <= changeNum ; i++){
			for(int j = 1; j <= lineNum; j++){
				changer[i][j] = j;
			}
		}

		//??\???????????????
		for(int i = 1;i <= changeNum; i++){
			String[] tmpStr = br.readLine().split(",");
			changer[i][Integer.parseInt(tmpStr[0])] = Integer.parseInt(tmpStr[1]);
			changer[i][Integer.parseInt(tmpStr[1])] = Integer.parseInt(tmpStr[0]);
		}

		//???????????????
		int[] answer = new int[lineNum + 1];

		for(int i = 1; i <= lineNum ; i++){
			int tmpAnswer = i;

			for(int j = 1; j <= changeNum ; j++){
				//System.out.println("next "+changer[j][tmpAnswer]);
				tmpAnswer = changer[j][tmpAnswer];
			}

			answer[tmpAnswer] = i;
		}

		for(int i = 1; i <= lineNum; i++){
			System.out.println(answer[i]);
		}
	}

}