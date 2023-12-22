import java.util.Scanner;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String s = sc.next();
		//部分文字列対象
		String t = sc.next();
		
		int slength = s.length();
		int tlength = t.length();
		
		String[] tArray = t.split("");
		int result = slength;
		for (int i = 0; i<= (slength - tlength); i++) {
			String subS = s.substring(i,tlength + i);
			String[] subSArray = subS.split("");
			int innerResult = 0;
			for (int j = 0; j<subS.length(); j++) {
				String subTChar = tArray[j];
				String subSChar = subSArray[j];
				//異なったら変換が必要
				if (!subTChar.equals(subSChar)) {
					innerResult++;
				}
			}
			if (innerResult <= result) {
				result = innerResult;
			}
		}
		System.out.println(result);
	}	

}
