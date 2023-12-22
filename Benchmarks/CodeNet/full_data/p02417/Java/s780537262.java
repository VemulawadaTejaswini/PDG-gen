
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		char chA ='a';
		char chA1 ='A';
		char[] arrayAlpha = new char[26];
		char[] arrayAlpha1 = new char[26];


		int[] arrayCount = new int[26];

		for(int i = 0; i <= ('z'-'a'); i++) {
			//System.out.println(chA++);
			arrayAlpha[i] = chA;
			arrayAlpha1[i] = chA1;

			chA1++;
			chA++;
		//	System.out.println("arrayAlpha[i]"+arrayAlpha[i]);
		}

		String strKarioki ="";
		char chKarioki1 =' ';

		while(sc.hasNext()) {

			String strInput = sc.nextLine();

			for(int i = 0; i < strInput.length(); i++) {

				//??\?????????????????????????§£????????????
				strKarioki = strInput.substring(i,i+1);
				//String??????char??????????????????
				chKarioki1 = strKarioki.charAt(0);

				for(int j = 0; j <= ('z'-'a'); j++) {
					if(chKarioki1 == arrayAlpha[j] || chKarioki1 == arrayAlpha1[j]) {
						arrayCount[j] += 1;
					}
				}
			}
		}
		for(int j = 0; j <= ('z'-'a'); j++) {
			System.out.println(arrayAlpha[j] +" : "+arrayCount[j]);
		}
	}
}