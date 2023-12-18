import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int inputNum = sc.nextInt();
		sc.nextLine();


		String inputStr = sc.next();

		int cnt1 = 0;
		int cnt2 = 0;

		for(int i = 0 ; i < inputStr.length() ; i++) {

			if(inputStr.charAt(i) == '.') {

				cnt1 += 1;

			}else if(inputStr.charAt(i) == '#') {

				cnt2 += 1;

			}

		}

		if(cnt1 <= cnt2) {

			if(inputStr.charAt(inputStr.length()-1) == '.') {
				System.out.println(cnt1-1);
			}

			System.out.println(cnt1);

		}else if(cnt1 > cnt2) {

			if(inputStr.charAt(inputStr.length()-1) == '#') {
				System.out.println(cnt2-1);
			}
			System.out.println(cnt2);

		}

	}

}