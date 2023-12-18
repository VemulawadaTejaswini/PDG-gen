import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int strNum = sc.nextInt();
		int strLen = sc.nextInt();
		sc.nextLine();
		String[] strs = new String[strNum];
		for(int i=0; i<strNum; i++) {
			strs[i] = sc.nextLine();
		}

		//ソートループ
		for(int i=0; i<strNum; i++) {
			for(int j=i+1; j<strNum; j++) {
				if(!minStr(strLen,strs[i],strs[j])) {
					String tmp=strs[i];
					strs[i]=strs[j];
					strs[j]=tmp;
				}
			}
		}

		output(strs);

	}

	private static boolean minStr(int strLen, String strs, String strt) {
		for(int j=0; j<strLen; j++) {
			char sChar = strs.charAt(j);
			char tChar = strt.charAt(j);
			if(sChar != tChar) {
				return sChar<tChar;
			}
		}
		return true;
	}

	private static void output(String[] strs) {
		for(int i=0; i<strs.length; i++) {
			System.out.print(strs[i]);
		}
		System.out.println();
	}

}
