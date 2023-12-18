import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int count = 0;
		while(count != k) {
			System.out.print(count % 9 + 1);
			for(int i = 0; i < count/ 9; i++) {
				System.out.print(9);
			}
			System.out.println("");
			count++;
		}
//		String[] ary = new String[23];
		
//		for(int r = 0; r < ary.length; r++) {
//			if(r < 9) {
//				ary[r] = String.valueOf(r+1);
//			}else {
//				//8-22
//				String tmp = "1";
//				for(int l = 0; l < r-8; l++) {
//					tmp = tmp + "9";
//				}
//				ary[r]= tmp;
//			}
//		}
//		for(int i = 0; i < k; i++) {
////			if(i == 10) {
////				System.out.println("199999999999");
////			}else {
//			System.out.println(ary[i]);
////			}
//		}
		
		
//		char[] ch = scanner.next().toCharArray();
//		int s = 0;
//		for(int i = 0; i < ch.length; i++) {
//			s += ch[i] - '0';
//		}
		
	}

}