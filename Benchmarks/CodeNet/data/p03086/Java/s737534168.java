import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String s = scanner.nextLine();

		String temp = null;

		int ans1 = 0;
		int ans2 = 0;

		for(int i = 0; i < s.length(); i++) {

			temp = String.valueOf(s.charAt(i));

			if(temp.equals("A") || temp.equals("C")|| temp.equals("G")|| temp.equals("T")) {

				for(int j = i; j < s.length(); j ++) {
					temp = String.valueOf(s.charAt(j));

					if(temp.equals("A") || temp.equals("C")|| temp.equals("G")|| temp.equals("T")) {
					ans1++;
					}else {
						break;
					}

				}

			}

			i += ans1;
			ans2 = Math.max(ans1, ans2);
			ans1 = 0;


		}

		System.out.println(ans2);


	}

}
