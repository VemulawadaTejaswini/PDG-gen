import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		sc.nextInt();
		sc.nextLine();


		String inputStr = sc.next();

		int cnt1 = 0;
		int cnt2 = 0;


		for(int i = 0 ; i < inputStr.length() -1 ; i++) {

			if(inputStr.charAt(i) == '#' && inputStr.charAt(i + 1) == '.') {

				cnt1 += 1;

			}

		}

		System.out.println(cnt1);
    }
}