
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] arrChar = s.toCharArray();
		sc.close();
 
		int diffAns010 = 0;
		// 0101010101....に修正する場合の修正回数
		for (int i = 0; i < arrChar.length; i++) {
			if (i % 2 == 0 && arrChar[i] == '1') {
				diffAns010++;
			} else if (i % 2 == 1 && arrChar[i] == '0') {
				diffAns010++;
			}
		}
 
		int diffAns101 = 0;
		// 1010101010.....に修正する場合の修正回数
		for (int i = 0; i < arrChar.length; i++) {
			if (i % 2 == 0 && arrChar[i] == '0') {
				diffAns101++;
			} else if (i % 2 == 1 && arrChar[i] == '1') {
				diffAns101++;
			}
		}
		//　修正回数が少ないほうの値を返す
		System.out.println(Math.min(diffAns010, diffAns101));
	}
}