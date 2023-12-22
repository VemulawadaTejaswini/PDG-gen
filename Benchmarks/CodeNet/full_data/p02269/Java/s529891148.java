import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		// A C G T
		// 1 2 3 4
		// ACGTACGTACGTACGT
		// 最大値は4 + 4^2 + 4^3 + ... + 4^12 = 4(4^12 - 1) / (4 - 1) = ? 
		int max = 4 * ((1 << 24) - 1) / (4 - 1);
		boolean[] dic = new boolean[max + 1];
		
		for (int i = 0; i < n; i++) {
			String cmd = sc.next();
			String str = sc.next();
		
			if (cmd.equals("insert")) {
				dic[getHashNum(str)] = true;
			} else {
				if (dic[getHashNum(str)]) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			}
		}
	}
	
	public static int getHashNum(String str) {
		int hashNum = 0;
		for (int j = 0; j < str.length(); j++) {
			hashNum += getValueOfChar(str.charAt(j)) * Math.pow(4, str.length() - (j + 1));
		}
		return hashNum;
	}
	
	public static int getValueOfChar(char c) {
		switch (c) {
		case 'A':
			return 1;
		case 'C':
			return 2;
		case 'G':
			return 3;
		case 'T':
			return 4;
		default:
			return 0;
		}
	}
}