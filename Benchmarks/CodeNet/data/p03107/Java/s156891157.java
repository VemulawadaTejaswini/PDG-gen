import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		int score= 0;
		int zero = 0;
		int one= 0;
		int tmp = '2';
		int tmpIndex = 0;
		int addScore = 0;
		int r;
		char[] c = s.toCharArray();
		do {
			addScore= 0;
			for(r = 0; r<c.length; r++) {
				if(c[r]!= '2') {
					tmp = c[r];
					tmpIndex = r;
					break;
				}
			}
			for(int n = r+1; n< c.length; n++) {
				if(c[n]== '2') continue;
				if(tmp == c[n] || tmp == '3') {
					tmp = c[n];
					tmpIndex = n;

				}else {
					addScore++;
					c[n] ='2';
					c[tmpIndex]= '2';
					tmp = '3';
				}
			    }
			score += addScore;
			}while(addScore!= 0);
//			for(int n = 0; n< c.length; n++) {
//				if(c[n]== '0' ) {
//					zero++;
//					if(one > 0) {
//						if(one>= tmp) {
//							score += tmp;
//							one -= tmp;
//						}else {
//							score += one;
//							one = 0;
//						}
//						tmp  = one;
//						one = 0;
//					}
//				}
//				if(c[n]== '1' ) {
//					one ++;
//					if(zero > 0) {
//						if(zero>= tmp) {
//							score += tmp;
//							zero -= tmp;
//						}else {
//							score += zero;
//							zero = 0;
//						}
//						tmp  = zero;
//						zero = 0;
//					}
//				}
//			}
//			score += Math.min(Math.max(zero, one), tmp);
		System.out.println(score*2);
		}
		
	}
