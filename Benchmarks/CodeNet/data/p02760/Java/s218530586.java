import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		int[][][] card  = new int[3][3][2];
		for(int i = 0; i < 3; i++){
			String line = scanner.nextLine();
			String[] ss = line.split(" ");
			for(int j = 0; j < 3; j++){
				card[i][j][0] = Integer.parseInt(ss[j]);
				card[i][j][1] = 0;
			}
		}
		int n = scanner.nextInt();

		int[] b = new int[n];
		for(int i = 0; i < n; i++){
			b[i] = scanner.nextInt();
			for(int k = 0; k < 3; k++){
				for(int j = 0; j < 3; j++){
					if(card[k][j][0] == b[i]){
						card[k][j][1] = 1;
					}
				}
			}
		}
		Boolean isBingo = false;
		// row
		for(int i = 0; i < 3; i++){
			if(isBingo)break;
			isBingo = (card[i][0][1]*card[i][1][1]*card[i][2][1] == 1);
		}
		for(int i = 0; i < 3; i++){
			if(isBingo)break;
			isBingo = (card[0][i][1]*card[1][i][1]*card[2][i][1] == 1);
		}

		if(!isBingo){
			isBingo = (card[0][0][1]*card[1][1][1]*card[2][2][1] == 1);
		}

		if(!isBingo){
			isBingo = (card[2][0][1]*card[1][1][1]*card[0][2][1] == 1);
		}

		String result = isBingo ? "Yes" : "No";
		System.out.println(result);
	}

}
