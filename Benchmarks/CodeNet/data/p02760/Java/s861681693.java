import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		
		
		int[][]card=new int[3][3];	//3*3のビンゴカード配列
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				card[i][j]=sc.nextInt();
			}
		}
		//当選番号入力数分回す
				int Count = sc.nextInt();
				int[] win = new int[Count];
				for(int c = 0; c <Count; c++) {
					win[c] = sc.nextInt();
				}
		 
				
				for(int cnt = 0; cnt < win.length; cnt++) {
					for(int i = 0 ; i < 3; i++) {
						for(int j = 0 ; j < 3; j++) {
							if(card[i][j] == win[cnt]) {
								card[i][j] = 0;
							}
						}
					}
				}
				//ビンゴのパターン
				boolean p1 = card[0][0] + card[0][1] + card[0][2] == 0;
				boolean p2 = card[1][0] + card[1][1] + card[1][2] == 0;
				boolean p3 = card[2][0] + card[2][1] + card[2][2] == 0;
				boolean p4 = card[0][0] + card[1][1] + card[2][2] == 0;
				boolean p5 = card[2][0] + card[1][1] + card[0][2] == 0;
				boolean p6 = card[0][0] + card[1][0] + card[2][0] == 0;
				boolean p7 = card[0][1] + card[1][1] + card[2][1] == 0;
				boolean p8 = card[0][2] + card[1][2] + card[2][2] == 0;
		 
				
				if(p1 || p2 || p3 || p4 || p5 || p6 ||  p7 || p8) {
					System.out.println("Yes");
				}else {
					System.out.println("No");
				}
	
		
		sc.close();
	}

}