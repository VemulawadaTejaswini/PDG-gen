import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String string = cin.next();
		int K = cin.nextInt();
		//贪心算法的最佳体现
		int i;
		for (i=0;i<string.length()-1;i++){
			//最后一个字符要单独处理
			char c = string.charAt(i);
			if (K < 'z' - c + 1) {
				System.out.print(c);
				continue;
			}
			System.out.print('a');
			K -= 'z' - c + 1;
		}
		K %= 26;
		char c = string.charAt(i);
		if (K >= 'z' - c + 1) {
			System.out.print((char)('a' + (K - 'z' + c -1 ) % 26));
		} else {
			System.out.print( (char)(c + K));
		}
	} 
}