import java.util.Scanner;

/** AOJ_No.1159 ICPC_2009_A */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int n = sc.nextInt();/* 候補者数 */
			int p = sc.nextInt();/* 小石の数 */
			if(n == 0) break;
			
			int[] hand = new int[n];/* 候補者の手元 */
			boolean _break = false;/* while(true)の終了条件を満たすか */
			while(true) {
				for(int i = 0; i < n; i++) {
					if(p == 0) {
						/* 椀が空なら、手札を椀に戻す */
						p = hand[i];
						hand[i] = 0;
					} else {
						/* 手札に一枚もってくる */
						hand[i]++;
						p--;
						
						/* (取り出し後に)椀が空なら */
						if(p == 0) {
							boolean isWin = true;/* 当選フラグ */
							for(int j = 0; j < n; j++) {
								/* 他の候補者に石があるならダメ */
								if(j != i && hand[j] != 0) isWin = false;
							}
							
							/* 当選者が居たなら */
							if(isWin) {
								System.out.println(i);
								_break = true;
								break;
							}
						}
					}
				}
				/* 当選者が出たなら */
				if(_break) break;
			}			
		}
	}
}

