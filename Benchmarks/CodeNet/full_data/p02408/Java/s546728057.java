package introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	
	static boolean flag[][] = new boolean[4][13];

	public static void main(String[] args) throws IOException {
		
		String a[] = {"S", "H", "C", "D"};
		String n[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"};
		
		String trump[][] = new String[4][13];
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 13; j++) {
				trump[i][j] = a[i] + " " + n[j];
						
			}
		}
		
		for(int k = 0; k < 4; k++) {
			for(int l = 0; l < 12; l++) {
				flag[k][l] = false;
			}
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int num = Integer.parseInt(str);
		
		String cards[] = new String[num];
		
		for(int m = 0; m < num; m++) {
			cards[m] = br.readLine();
			check(cards[m]);
		
		}
		
		for(int o = 0; o < 4; o++) {
			for(int p= 0; p < 13; p++) {
				if(flag[o][p] != true) {
					System.out.println(trump[o][p]);
				}
			}
		}
	}
	
	static void check(String card) {
		switch(card.substring(0,1)){
		case "S":
			flag[0][Integer.parseInt(card.substring(2)) - 1] = true;
			break;
		case "H":
			flag[1][Integer.parseInt(card.substring(2)) - 1] = true;
			break;
		case "C":
			flag[2][Integer.parseInt(card.substring(2)) - 1] = true;
			break;
		case "D":
			flag[3][Integer.parseInt(card.substring(2)) - 1] = true;
			break;
		}
	}
	
}