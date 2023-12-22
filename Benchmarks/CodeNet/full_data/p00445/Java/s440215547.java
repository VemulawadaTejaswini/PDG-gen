import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		
		char[] charStr = str.toCharArray();

		int cntJOI = 0, cntIOI = 0;
		
		for(int i = 2; i < charStr.length; i++) {
			
			if(String.valueOf(charStr[i - 2] + "" + charStr[i - 1] + "" + charStr[i]).equals("JOI")) {
				cntJOI++;
			}
			
			if(String.valueOf(charStr[i - 2] + "" + charStr[i - 1] + "" + charStr[i]).equals("IOI")) {
				cntIOI++;
			}
		}
		
		System.out.println(cntJOI);
		System.out.println(cntIOI);
	}
}