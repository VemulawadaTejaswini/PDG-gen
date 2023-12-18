package getAc;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	private static String halfSapce = " ";

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);

		String tmp = sc1.nextLine();

		String[] tmpStrs = tmp.split(halfSapce);

		//int length = Integer.parseInt(tmpStrs[0]);
		int numOfQuestion = Integer.parseInt(tmpStrs[1]);


		String str = sc1.nextLine();


//		if(str.length() != length) {
//			sc1.close();
//			return;
//		}

		int count[] = new int[numOfQuestion];

		Pattern p = Pattern.compile("AC");

		for(int i = 0; i < numOfQuestion; i++) {
			String tmp2 = sc1.nextLine();

			String[] tmpStrs2 = tmp2.split(halfSapce);

			int start = Integer.parseInt(tmpStrs2[0]);
			int end = Integer.parseInt(tmpStrs2[1]);

			Matcher m = p.matcher(str.substring(start - 1 , end));

			while(m.find()) {
				count[i]++;
			}
		}

		sc1.close();

		for(int i = 0; i < numOfQuestion; i++) {
			System.out.println(count[i]);

		}

	}

}
