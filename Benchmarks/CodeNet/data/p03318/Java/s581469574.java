import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		
		long[] ary = {1, 2, 3, 4, 5, 6, 7, 8, 9, 19};
		
		for(int i = 0; i < k; i++) {
			if(i == 10) {
				System.out.println("199999999999");
			}else {
			System.out.println(ary[i]);
			}
		}
		
//		char[] ch = scanner.next().toCharArray();
//		int s = 0;
//		for(int i = 0; i < ch.length; i++) {
//			s += ch[i] - '0';
//		}
		
	}

}