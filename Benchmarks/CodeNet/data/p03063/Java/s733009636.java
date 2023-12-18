import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		//入力
		sc.nextInt();
		sc.nextLine();
		String inputStr = sc.next();


		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;


		/*
		for(int i = 0 ; i < inputStr.length() -1 ; i++) {

			if(inputStr.charAt(i) == '#' && inputStr.charAt(i + 1) == '.') {

				cnt3 += 1;

			}

		}
		*/

		//System.out.println(cnt1);

		int k = 0;

		while(inputStr.charAt(k) == '.') {

			k += 1;

		}

		for(int l = k ; l < inputStr.length() ; l++) {

			if(inputStr.charAt(l) == '.') {

				cnt3 += 1;

			}

		}

		for(int i = 0 ; i < inputStr.length() ; i++) {

			if(inputStr.charAt(i) == '.') {

				cnt1 += 1;

			}else if(inputStr.charAt(i) == '#') {

				cnt2 += 1;

			}

		}

		if(cnt1 < cnt2) {


			if(inputStr.charAt(0) == '.') {
				cnt1 -= 1;
				//System.out.println(cnt1-1);
			}else {
				//System.out.println(cnt1);
			}




		}else if(cnt1 > cnt2) {

			if(inputStr.charAt(inputStr.length()-1) == '#') {
				cnt2 -= 1;
				//System.out.println(cnt2-1);
			}else {
				//System.out.println(cnt2);
			}


		}else if(cnt1 == cnt2) {

			if(inputStr.charAt(inputStr.length()-1) == '#' || inputStr.charAt(0) == '.') {
				//System.out.println(cnt2-1);
				cnt2 -= 1;
			}else {
				//System.out.println(cnt2);
			}

		}


		int min1 = Math.min(cnt1, cnt2);
		int min2 = Math.min(cnt3, min1);


		System.out.println(min2);
		sc.close();
	}

}